package zadania.zadanie1;

public class Zadanie2 {

    public int multiply(int a, int b) {
        int c = 0;
        int i = 0;
        while (i < b) {
            c += a;
            i++;
        }
        return c;
    }

    public int potęga(int podstawa, int wykladnik) {

        int wynik = podstawa;
        if ( wykladnik == 0) {
            return 1;

        } else if (wykladnik == 1) {
            return podstawa;

        } else if (wykladnik > 0) {

            for (int i = 1; i < wykladnik; i++) {

                wynik = multiply(wynik, podstawa);
            }
        }
        return wynik;
    }

    public static void main(String[] args) {
        Zadanie2 zadanie2 = new Zadanie2();

        System.out.println(zadanie2.multiply(2, 3));

        System.out.println(zadanie2.potęga(2, 3));
    }
}
