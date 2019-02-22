public class Start {

    public static void main(String [] args)
    {
        Pizza[] p = InOut.lecture();
        for(Pizza pi : p) {
            System.out.println(pi);
            //System.out.println(pi.resolution());

            InOut.ecriture(pi.resolution(), pi.fichier());
        }

    }

}
