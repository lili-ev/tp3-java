public class ex4 {

    public static void affiche(double t[][]) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean regulier(double t[][]) {
        if (t.length == 0) {
            return true;
        }

        int taille = t[0].length;

        for (int i = 1; i < t.length; i++) {
            if (t[i].length != taille) {
                return false;
            }
        }

        return true;
    }

    public static double[] sommeLignes(double t[][]) {
        double[] resultat = new double[t.length];

        for (int i = 0; i < t.length; i++) {
            double somme = 0;

            for (int j = 0; j < t[i].length; j++) {
                somme = somme + t[i][j];
            }

            resultat[i] = somme;
        }

        return resultat;
    }

    public static double[][] somme(double[][] t1, double[][] t2) {

        if (!regulier(t1) || !regulier(t2)) {
            return null;
        }

        if (t1.length != t2.length) {
            return null;
        }

        if (t1.length > 0 && t1[0].length != t2[0].length) {
            return null;
        }

        double[][] resultat = new double[t1.length][];

        for (int i = 0; i < t1.length; i++) {
            resultat[i] = new double[t1[i].length];

            for (int j = 0; j < t1[i].length; j++) {
                resultat[i][j] = t1[i][j] + t2[i][j];
            }
        }

        return resultat;
    }

    public static void main(String[] args) {

        double[][] t1 = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0}
        };

        double[][] t2 = {
            {10.0, 20.0, 30.0},
            {40.0, 50.0, 60.0}
        };

        System.out.println("Tableau t1 :");
        affiche(t1);

        System.out.println("Tableau t2 :");
        affiche(t2);

        System.out.println("t1 est regulier : " + regulier(t1));
        System.out.println("t2 est regulier : " + regulier(t2));

        double[] sommes = sommeLignes(t1);

        System.out.println("Sommes des lignes de t1 :");
        for (int i = 0; i < sommes.length; i++) {
            System.out.println(sommes[i]);
        }

        double[][] resultat = somme(t1, t2);

        System.out.println("Somme de t1 et t2 :");
        if (resultat != null) {
            affiche(resultat);
        } else {
            System.out.println("Les tableaux ne sont pas compatibles.");
        }
    }
}
