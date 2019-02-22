public class InOut {


    String input = "src/test/resources/problem1/DiviserPourRegner_2.2.txt";
    String[] result = main.problem_1(getFileText(input));


    public static String[] problem_1_naive(String s_file) {
        System.out.println("===");
        System.out.println(s_file);
        System.out.println("===");

        return Probleme1.traitement(s_file, false);
    }
}