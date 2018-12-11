package dzien3.abstrakcyjne;

public class AbstractExample {
    public static void main(String[] args) {
        //AbstractClass abstractClass=new AbstractClass();
        InheritAbstractClass inheritAbstractClass = new InheritAbstractClass();
        inheritAbstractClass.saySomething();
        inheritAbstractClass.saySomethingUseful();

        AbstractClass abstractClass = new InheritAbstractClass();
        ((InheritAbstractClass) abstractClass).sayHello();

    }
}
