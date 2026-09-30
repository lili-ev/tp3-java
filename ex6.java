import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] T = new int[n];

        for (int i = 0; i < n; i++) {
            T[i] = sc.nextInt();
        }

        int MAXV = 100000;
        int[] freq = new int[MAXV + 1];

        int distinct = 0;

        // Première fenêtre
        for (int i = 0; i < k; i++) {
            int x = T[i];

            if (freq[x] == 0) {
                distinct++;
            }

            freq[x]++;
        }

        System.out.print(distinct);

        // Faire glisser la fenêtre
        for (int i = k; i < n; i++) {

            // Retirer l'élément sortant
            int out = T[i - k];
            freq[out]--;

            if (freq[out] == 0) {
                distinct--;
            }

            // Ajouter l'élément entrant
            int in = T[i];
            freq[in]++;

            if (freq[in] == 1) {
                distinct++;
            }

            System.out.print(" " + distinct);
        }

        System.out.println();
    }
}
