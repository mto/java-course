/**
 * @author <a href="hoang281283@gmail.com">Minh Hoang TO</a>
 * @date: 8/27/17
 */
public class ExceptionMaster {

    public static void main(String[] args) {
        String[] names = new String[5];
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i].length());
        }

        System.out.println(names[5]);
    }

}
