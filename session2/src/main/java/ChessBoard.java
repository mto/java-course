/**
 * @author <a href="hoang281283@gmail.com">Minh Hoang TO</a>
 * @date: 7/28/17
 */
public class ChessBoard {

    public static void main(String[] args) {
        String bMainPieces = " \u265C \u265E \u265D \u265B \u265A \u265D \u265E \u265C";
        String bPawns = " \u265F \u265F \u265F \u265F \u265F \u265F \u265F \u265F";
        String wMainPieces = " \u2656 \u2658 \u2657 \u2655 \u2654 \u2657 \u2658 \u2656";
        String wPawns = " \u2659 \u2659 \u2659 \u2659 \u2659 \u2659 \u2659 \u2659";

        System.out.println("\nWei WI\n");
        System.out.println(bMainPieces);
        System.out.println(bPawns);

        for (int i = 2; i < 6; i++) {
            System.out.println();
        }

        System.out.println(wPawns);
        System.out.println(wMainPieces);

        System.out.println("\nQuang Liem LE\n");
    }
}
