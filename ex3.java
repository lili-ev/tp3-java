import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Combien de valeurs : ");
        int n = sc.nextInt();

        int[] tableau = new int[n];

        for (int i = 0; i < n; i++) {
            int impair = 2 * i + 1;
            tableau[i] = impair * impair;
        }

        for (int i = 0; i < n; i++) {
            int impair = 2 * i + 1;
            System.out.println(impair + " a pour carre " + tableau[i]);
        }
    }
}
