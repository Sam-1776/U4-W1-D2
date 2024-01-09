import it.sam.be.automobile.Automobile;

import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static String risp = "si";
    public static void main(String[] args) {

        Automobile auto = new Automobile(1200, "hjsdfhsduash");
        System.out.println("Teoria D2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("vuoi accendere il motore?");
        String chiave = scanner.nextLine();
        String newRisp = chiave;
        if (Objects.equals(newRisp, risp)) {
            auto.avviaAuto();
        }

        scanner.close();

    }
}