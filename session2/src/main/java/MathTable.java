/**
 * @author <a href="hoang281283@gmail.com">Minh Hoang TO</a>
 * @date: 7/28/17
 */
public class MathTable {

    private void printProduct(int i, int j) {
        System.out.println(i + " x " + j + " = " + i * j);
    }

    private void printSum(int i, int j) {
        /**
         * Print out i + j =
         *
         * Ex: 1 + 1 = 2; 2+ 3= 4;...
         */
    }

    private void printFactorial(int i) {
        /**
         * Print out i!=...
         *
         * Ex: 1!=1, 2!= 2, 3!= 6, 5!=120
         */
    }

    public void multiplicationTable() {
        for (int i = 1; i < 11; i++) {
            for (int j = i; j < 11; j++) {
                printProduct(i, j);
            }
            System.out.println();
        }
    }

    public void sumTable() {
        for (int i = 1; i < 11; i++) {
            for (int j = i; j < 11; j++) {
                printSum(i, j);
            }
            System.out.println();
        }
    }

    public void factorialTable() {
        for (int i = 1; i < 11; i++) {
            printFactorial(i);
        }
    }

    public static void main(String[] args) {
        MathTable mt = new MathTable();

        mt.multiplicationTable();
        System.out.println();
        mt.sumTable();
        System.out.println();
        mt.factorialTable();
        System.out.println();
    }

}
