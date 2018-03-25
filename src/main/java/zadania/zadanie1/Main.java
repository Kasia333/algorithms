package zadania.zadanie1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("start");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę a");
        int a = scanner.nextInt();

        if (a < 0) {
            System.out.println("Błąd");
        }

        System.out.println("Podaj liczbę b");
        int b = scanner.nextInt();

        if (b < 0) {
            System.out.println("Błąd");
        }

        int dzielnik = 0;

        while (a!=b)

        while (a % dzielnik != 0 && b % dzielnik != 0) {
            if (a % dzielnik != 0) {
                dzielnik++;
            }


            System.out.println("koniec");
        }
    }
}
