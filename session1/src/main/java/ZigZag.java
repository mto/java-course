/**
 * @author <a href="hoang281283@gmail.com">Minh Hoang TO</a>
 * @date: 27/07/2017
 */
public class ZigZag {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 17; j++) {
                int sum = i + j;
                int diff = j - i;

                if (sum == 4 || sum == 12 || diff == 4 || diff == 12) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

    }
}
