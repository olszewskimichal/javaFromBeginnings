package dzien1;

public class OperatoryLogiczne {
    public static void main(String[] args) {
        System.out.println("Negacja");
        boolean value1 = true;
        boolean value2 = !value1;
        System.out.println(value2);

        System.out.println("Podwojna negacja");
        System.out.println(!!value1);

        System.out.println("Koniunkcja");
        System.out.println(true && true);
        System.out.println(true && false);

        System.out.println("Alternatywa");
        System.out.println(false || false);
        System.out.println(true || false);

        System.out.println("Alternatywa roz��czna");
        System.out.println(false != false);
        System.out.println(true != false);
    }
}
