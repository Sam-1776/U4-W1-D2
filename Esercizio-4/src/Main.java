import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Esercizio 4");

        Scanner scanner = new Scanner(System.in);
        System.out.println("inserire un numero");
        int x = scanner.nextInt();

        for (int i = x; i > 0; i--) {
            System.out.println(i);
        }
    }
}