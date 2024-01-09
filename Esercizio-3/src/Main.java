import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Esercizio 3");

        Scanner scanner = new Scanner(System.in);

        String x = scanner.nextLine();
        int i = 0;
        String punti = ":";
        String letterQ = "q";
        String[] newX = new String[0];
        newX = x.split("");
        while (!Objects.equals(newX[i], punti) || !Objects.equals(newX[i], letterQ) && i == newX.length){
        System.out.println(newX[i]+ ",");
        i++;
        }

    }

}