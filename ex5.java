import java.util.Scanner;

public class ex5 {

    public static void rotate90ClockwiseInPlace(int[][] A) {

        int n = A.length;

        // 1. Transposition
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }

        // 2. Renverser chaque ligne
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {

                int temp = A[i][j];
                A[i][j] = A[i][n - 1 - j];
                A[i][n - 1 - j] = temp;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez N : ");
        int n = sc.nextInt();

        int[][] A = new int[n][n];

        // Lire la matrice
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Rotation de 90 degrés
        rotate90ClockwiseInPlace(A);

        // Afficher la matrice
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
