package dzien2;

public class Metody {
    static boolean isBig(int number) {
        return number > 100;
    }

    int addNumbers(int a, int b, int c) {
        return a + b + c;
    }

    void printSomething() {
        System.out.println("Something");
    }

    int dodaj(int a, int b) {
        return a + b;
    }

    double dodaj(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Wywolywa� val mozna poprzez zwr�cenie obiektu dzien3.klasy kt�ra stworzyli�my i
        // uruchomieniu val na tym poszczeg�lnym obiekcie
        Metody val = new Metody();
        val.printSomething();

        // Lub tworz�� metode statyczn� i odwolywa� si� do val bezpo�rednio z dzien3.klasy
        System.out.println(Metody.isBig(34));
    }
}
