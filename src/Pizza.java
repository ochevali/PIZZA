public class Pizza {
    private int min;
    private int max;
    private int lignes;
    private int colonnes;
    private char[][] pizza;
    private String fichier;

    Pizza(int mini, int maxi, int nbLignes, int nbColonnes, char[][] elPizza, String fichiersSource){
        min = mini;
        max = maxi;
        lignes = nbLignes;
        colonnes = nbColonnes;
        pizza = elPizza;
        fichier = fichiersSource;
    }
    public String toString(){
        return "fichier : "+fichier+"\nLignes : "+lignes+"\nColonnes : "+colonnes;
    }
    public String fichier(){
        return fichier;
    }
    public int min(){
        return min;
    }
    public int max(){
        return max;
    }
    public int lignes(){
        return lignes;
    }
    public int colonnes(){
        return colonnes;
    }
    public char[][] pizza(){
        return pizza;
    }

    public String resolution(){
        int count = 0;
        int ligDeb;
        int colDeb;
        int ligFin = (max/2)-1;
        int colFin = (2-1);
        boolean tomate;
        boolean champ;

        StringBuilder sol = new StringBuilder("");
        for(ligDeb= 0; (ligDeb+ligFin)<lignes; ligDeb = ligDeb+ligFin){
                        ligFin=(max/2);

            for(colDeb = 0; (colDeb+colFin)<colonnes; colDeb = colDeb+colFin){
                            colFin = 2;
                tomate = false;
                champ = false;
                for(int i = ligDeb; i<ligDeb+ligFin; i++){
                    for(int j = colDeb; j< colDeb+colFin; j++){
                        if(pizza[i][j]=='T') tomate = true;
                        if(pizza[i][j]=='M') champ = true;
                    }
                }
                if(tomate&&champ){
                    count++;
                    sol.append(ligDeb+" "+colDeb+" "+(ligDeb+ligFin-1)+" "+(colDeb+colFin-1)+"\n");
                }
            }
        }



        return ""+count+"\n"+sol.toString();
    }
}
