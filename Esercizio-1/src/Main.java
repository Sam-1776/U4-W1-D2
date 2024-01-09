//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Esercizio 1");
        System.out.println(stringaPariDispari("alfonso"));
        System.out.println(annoBisestile(2024));
    }

    private static boolean stringaPariDispari(String x){
        if (x.length()%2 == 0) {
            boolean risp = true;
            return risp;
        }else {
            boolean risp = false;
            return risp;
        }
    }

    private static boolean annoBisestile( int x){
        if (x%4 == 0 || x%100 == 0 && x%400 == 0) {
            boolean risp = true;
            return risp;
        }else {
            boolean risp = false;
            return risp;
        }
    }
}