package zadania.zadanie1;

import java.util.Scanner;

public class Zadanie3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj funkcje");
        String funkcja = scanner.nextLine();

        Zadanie3 zadanie3 = new Zadanie3();
//        System.out.println(zadanie3.dlBokuKw(4));
//        System.out.println(zadanie3.dlBokuTR(7));
//        System.out.println(zadanie3.promienKola(10));

        if (funkcja.equals("kwadrat")) {
            System.out.println("podaj pole");
            double pole = scanner.nextDouble();

            System.out.println("dl wynosi " + zadanie3.dlBokuKw(pole));
        }

        if (funkcja.equals("trójkąt")) {
            System.out.println("podaj pole");
            double pole = scanner.nextDouble();
            System.out.println(zadanie3.dlBokuTR(pole));
        }

        if (funkcja.equals("kolo")) {
            System.out.println("podaj pole");
            double pole = scanner.nextDouble();

            System.out.println(zadanie3.promienKola(pole));

        } else {
            System.out.println("złe dane");
        }
    }

    public double dlBokuKw(double p) {
        double a = 0;
        if (0 < p) {
            a = Math.sqrt(p);
        }
        return a;
    }

    public double dlBokuTR(double p) {
        double a = 0;
        if (0 < p) {
            a = Math.sqrt((4 * p)) / 3;
        }
        return a;
    }

    public double promienKola(double p) {
        double r = 0;
        if (0 < p) {
            r = Math.sqrt((p / Math.PI));
        }
        return r;
    }
}