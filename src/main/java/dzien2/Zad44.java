package dzien2;

public class Zad44 {
    static int nwdEuklides(int a, int b) {
        while (a != b)
            if (a > b)
                a -= b; //lub a = a - b;
            else
                b -= a; //lub b = b-a
        return a; // lub b - obie zmienne przechowują wynik dzien2.Zad44(a,b)
    }

    public static void main(String[] args) {
        int nwdEuklides = nwdEuklides(25, 40);
        System.out.println("nwdEuklides = " + nwdEuklides);
    }
}
