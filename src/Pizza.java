public class Pizza {
    private int min;
    private int max;
    private int lignes;
    private int colonnes;
    private char[][] pizza;

    Pizza(int mini, int maxi, int nbLignes, int nbColonnes, char[][] elPizza){
        min = mini;
        max = maxi;
        lignes = nbLignes;
        colonnes = nbColonnes;
        pizza = elPizza;
    }
    public String toString(){
        return "nbLigne = "+lignes;
    }
}
