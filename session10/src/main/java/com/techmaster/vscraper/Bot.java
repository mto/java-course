package com.techmaster.vscraper;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author <a href="hoang281283@gmail.com">Minh Hoang TO</a>
 * @date: 17/09/2017
 */
public class Bot {

    private final String targetUrl;

    private final HttpClient httpClient;

    private String cachedHTML;

    private AtomicLong lastCacheSet = new AtomicLong(0L);

    public Bot(String url){
        targetUrl = url;

        httpClient = HttpClientBuilder.create().build();
    }

    public String getHTML(){
        try {
            HttpGet req = new HttpGet(targetUrl);
            HttpResponse res = httpClient.execute(req);

            return EntityUtils.toString(res.getEntity());
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }

    public String getCachedHTML(){
        long now = System.currentTimeMillis();

        if(now - lastCacheSet.get() > 2*60*1000L || cachedHTML == null){
            try{
                cachedHTML = getHTML();
                lastCacheSet.set(now);
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }

        return cachedHTML;
    }

    //NOTE: Code only work for https://video.vnexpress.net
    public List<String> extractVideos(){
        List<String> videoLinks = new LinkedList<String>();

        if(cachedHTML == null){
            System.out.println("HTML content was not loaded");
        }else{
            try {
                Document doc = Jsoup.parse(cachedHTML);
                //Find elements <div class="each_element item_video">
                Elements videoItems = doc.getElementsByAttributeValue("class", "each_element item_video");
                //Get attributes "data-extend" from those elements
                List<String> dataExtendAttributes = videoItems.eachAttr("data-extend");

                for(String dea :dataExtendAttributes){
                    String link = extractLink(dea);
                    if(link != null){
                        videoLinks.add(link);
                    }
                }
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }

        return videoLinks;
    }


    /**
     *
     * Extrack value associated with key "s240" from JSON structure
     *
     * {"direct":1,"live":"","h5p":"","ads":1,"zone":0,"ovl":"%3Cscript%20async%3D%22async%22%20src%3D%22https%3A%2F%2Fwww.googletagservices.com%2Ftag%2Fjs%2Fgpt.js%22%3E%3C%2Fscript%3E%3Cscript%3Evar%20googletag%20%3D%20googletag%20%7C%7C%20%7B%7D%3Bgoogletag.cmd%20%3D%20googletag.cmd%20%7C%7C%20%5B%5D%3B%3C%2Fscript%3E%3Cscript%3Egoogletag.cmd.push(function()%7Bgoogletag.defineSlot(%22%2F27973503%2Fvideo.vnexpress.net%2FOverlay.thethao%22%2C%5B480%2C70%5D%2C%22div-gpt-ad-1499311719070-0%22).addService(googletag.pubads())%3Bgoogletag.pubads().enableSingleRequest()%3Bgoogletag.pubads().collapseEmptyDivs()%3Bgoogletag.enableServices()%3B%7D)%3B%3C%2Fscript%3E%3Cdiv%20id%3D%22div-gpt-ad-1499311719070-0%22%20style%3D%22height%3A70px%3B%20width%3A480px%3B%22%3E%3Cscript%3Egoogletag.cmd.push(function()%7B%20googletag.display(%22div-gpt-ad-1499311719070-0%22)%3B%7D)%3B%3C%2Fscript%3E%3C%2Fdiv%3E","dfp":"https:\/\/pubads.g.doubleclick.net\/gampad\/live\/ads?sz=640x360|400x300|480x70|640x480|320x180&iu=\/27973503\/video.vnexpress.net\/Thethao&impl=s&gdfp_req=1&env=vp&output=vast&unviewed_position_start=1&url=[referrer_url]&description_url=[description_url]&correlator=[timestamp]",
     * "s240":"https:\/\/v.vnecdn.net\/thethao\/video\/web\/mp4\/240p\/2017\/09\/09\/rafael-nadal-3-1-juan-martin-del-potro-1504925006.mp4","s360":"https:\/\/v.vnecdn.net\/thethao\/video\/web\/mp4\/360p\/2017\/09\/09\/rafael-nadal-3-1-juan-martin-del-potro-1504925006.mp4","s480":"","s720":"https:\/\/v.vnecdn.net\/thethao\/video\/web\/mp4\/2017\/09\/09\/rafael-nadal-3-1-juan-martin-del-potro-1504925006.mp4",
     * "v_ex":"bs=0&pt=0"}
     *
     * @param dataExtendAttr
     * @return
     */
    private String extractLink(String dataExtendAttr){
        try{
            JSONObject json = new JSONObject(dataExtendAttr);

            return json.getString("s240");
        }catch (Exception ex){
            ex.printStackTrace();

            return null;
        }
    }



}
