package com.techmaster.vscraper;

import org.junit.Test;

import java.util.List;

/**
 * @author <a href="hoang281283@gmail.com">Minh Hoang TO</a>
 * @date: 17/09/2017
 */
public class BotTest {

    @Test
    public void getVideoLinks() {
        Bot vnxVideoBot = new Bot("https://video.vnexpress.net");
        vnxVideoBot.getCachedHTML();
        List<String> videoLinks = vnxVideoBot.extractVideos();

        for (String vlink : videoLinks) {
            System.out.println(vlink);
        }
    }
}
