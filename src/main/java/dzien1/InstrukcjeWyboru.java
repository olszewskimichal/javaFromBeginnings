package dzien1;

public class InstrukcjeWyboru {

  public static void main(String[] args) {
    int i = 2;

    switch (i) {
      case 2:
        System.out.println("2222");
        break;
      case 1:
        System.out.println("111");
        break;
      case 3:
        System.out.println("asada");
        System.out.println("3333");
        break;
      case 4:
        System.out.println("4444");
      case 5: {
        System.out.println("5555");
      }
      default:
        System.out.println("Co� innego");
        break;
    }

  }

}
