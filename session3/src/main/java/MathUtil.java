import java.util.Random;

/**
 * @author <a href="hoang281283@gmail.com">Minh Hoang TO</a>
 * @date: 7/31/17
 */
public class MathUtil {

    public static int[] randomPermutation(int n) {
        return randomPermutation(n, 0);
    }

    public static int[] randomPermutation(int n, int base) {
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = i + base;
        }

        for (int k = 1; k < n; k++) {
            int ridx = new Random().nextInt(n - k + 1);
            int tmp = p[n - k];
            p[n - k] = p[ridx];
            p[ridx] = tmp;
        }

        return p;
    }

}
