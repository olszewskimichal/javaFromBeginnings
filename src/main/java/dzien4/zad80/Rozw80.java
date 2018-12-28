package dzien4.zad80;

public class Rozw80 {

  public static String wielkimiLiterami(String s) {
    return s.toUpperCase();
  }

  public static String malymiLiterami(String s) {
    return s.toLowerCase();
  }


  public static String zamienNaInny(String s, String z) {
    return s.replace(s, z);
  }

  public static String coDrugaWielka(String s) {
    char tab[] = s.toLowerCase().toCharArray();
    for (int i = 0; i < tab.length; i++) {
      if (i % 2 == 0) {
        tab[i] = Character.toUpperCase(tab[i]);
      }
    }
    return new String(tab);
  }

  public static String odTylu(String s) {
    StringBuilder st = new StringBuilder(s).reverse();
    return st.toString();
  }

  public static int zliczSumeCyfr(int a) {
    int suma = 0;
    if (a < 100) {
      return -1;
    } else {
      while (a != 0) {
        int koncowka = a % 10;
        a /= 10;
        suma += koncowka;
      }
    }
    return suma;
  }


  public static void main(String[] args) {
    String s = "Paweł";
    System.out.println(wielkimiLiterami(s));
    System.out.println(malymiLiterami(s));
    System.out.println(zamienNaInny(s, "abc"));
    System.out.println(coDrugaWielka(s));
    System.out.println(odTylu(s));
    System.out.println(zliczSumeCyfr(543));
  }
}
