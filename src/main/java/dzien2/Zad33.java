package dzien2;

public class Zad33 {
    static String getDayName(int day) {
        switch (day) {
            case 1: {
                return "Poniedziałek";
            }
            case 2: {
                return "wtorek";
            }
            case 3: {
                return "sroda";
            }
            case 4: {
                return "czwartek";
            }
            case 5: {
                return "piatek";
            }
            case 6: {
                return "sobota";
            }
            case 7: {
                return "niedziela";
            }
            default: {
                return "nie ma takowego";
            }
        }
    }

    public static void main(String[] args) {
        int a = 3;

        String dayName = getDayName(a);
        System.out.println("dayName = " + dayName);
    }

}
