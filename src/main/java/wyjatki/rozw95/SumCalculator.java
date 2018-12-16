package wyjatki.rozw95;

public class SumCalculator {
    public static void main(String[] args) {
        int tab[] = {-1};
        try {
            System.out.println(sum(tab));
        } catch (EmptyArrayException e) {
            System.err.println("Pusta tablica");
        } 
    }

    public static int sum(int tab[]) {
        if (tab.length == 0)
            throw new EmptyArrayException("Tablica nie moze byc pusta");
        int sum = 0;
        for (int val : tab) {
            if (val < 0)
                throw new IllegalArgumentException("Wartość musi być dodatnia");
            sum += val;
        }
        return sum;
    }
}
