/**
 * @author <a href="hoang281283@gmail.com">Minh Hoang TO</a>
 * @date: 27/07/2017
 */
public class Arithmetic {

    public static void main(String[] args) {
        // Print out numbers 1 2 3 ... 100 and sum of squares
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            System.out.print(i + " ");
            sum += i * i;
        }
        System.out.println("Sum of squares: " + sum);

        // Print out odd numbers in the interval [1,100]
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
