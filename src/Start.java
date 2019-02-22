public class Start {

    public static void main(String [] args)
    {
        Pizza[] p = InOut.lecture();
        for(Pizza pi : p) {

            System.out.println(pi);
            InOut.ecriture(pi.toString(), pi.fichier());
        }

    }

}
