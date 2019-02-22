import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class InOut {


    public static Pizza[] lecture() {
        String[] fichiers = new String[4];

        fichiers[0] = "a_example";
        fichiers[1] = "b_small";
        fichiers[2] = "c_medium";
        fichiers[3] = "d_big";

        String source = "src/resources/in/";
        String destination = "src/resources/out/";
        Pizza[] test = new Pizza[4];
        int a=0;
        for(String fichier : fichiers) {
            int min;
            int max;
            int lignes;
            int colonnes;
            char[][] pizza;

            try {
                BufferedReader br = new BufferedReader(new FileReader(source + fichier + ".in"));

                String ligne = br.readLine();
                String[] param = ligne.split(" ");

                lignes = Integer.parseInt(param[0]);
                colonnes = Integer.parseInt(param[1]);
                min = Integer.parseInt(param[2]);
                max = Integer.parseInt(param[3]);

                pizza = new char[lignes][colonnes];

                int i = 0;

                while((ligne = br.readLine()) != null) {
                    for(int j = 0; j < colonnes; j++) {
                        pizza[i][j] = ligne.charAt(j);
                    }

                    i = i + 1;
                }
                test[a] = new Pizza(min, max, lignes, colonnes, pizza);
                br.close();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        return test;
    }

}