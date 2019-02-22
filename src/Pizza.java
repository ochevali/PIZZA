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
        return "fichier : "+fichier;
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
}
