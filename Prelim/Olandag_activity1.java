import java.util.Scanner;

public class Olandag_activity1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("tirada diha badi palihug kog enter sa numero: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + ", even na siya dodong.");
        } else {
            System.out.println(number + ", odd mana dodong.");
        }

        scanner.close();
    }
}