import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilość punktów z testu: ");
        int wynik = sc.nextInt();
        if (wynik < 50) {
            System.out.println("Musisz się jeszcze dużo nauczyć.");
        } else if (wynik > 50 && wynik < 70) {
            System.out.println("Średni wynik, ale jesteś na dobrej drodze.");
        } else if (wynik > 70) {
            System.out.println("Świetnie! Dobrze Ci poszło.");
        }
    }
}