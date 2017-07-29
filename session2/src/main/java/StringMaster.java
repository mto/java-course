/**
 * @author <a href="hoang281283@gmail.com">Minh Hoang TO</a>
 * @date: 7/29/17
 */
public class StringMaster {

    public static void main(String[] args) {
        String s1 = "TechMaster Java Course";

        String s2;
        s2 = "Khóa học lập trình Java";

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 + " - " + s2);

        System.out.println(s1.length());
        for (int i = 0; i < s1.length(); i++) {
            System.out.print(s1.charAt(i) + " ");
        }

        System.out.println(s2.length());
        for (int i = 0; i < s2.length(); i++) {
            System.out.print(s2.charAt(i) + " ");
        }

        String s3 = "Woman without her man is nothing";
        String[] words = s3.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
