/**
 * @author <a href="hoang281283@gmail.com">Minh Hoang TO</a>
 * @date: 27/07/2017
 */
public class StarRectangle {

    public static void main(String[] args) {
        /**
         * Print out 5*17 rectangle filled with '*'
         *
         *    *****************
         *    *****************
         *    *****************
         *    *****************
         *    *****************
         *    *****************
         *
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 17; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
