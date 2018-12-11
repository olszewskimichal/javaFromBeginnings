package exceptions;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            // kod programu mog�cy generowa� wyj�tki
        } catch (NullPointerException b) {
            // Obs�uga wyj�tku b
        } catch (RuntimeException a) {
            // Obs�uga wyj�tku a
        } finally {
            System.out.println("Finally");
        }

    }
}
