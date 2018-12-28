package compare;

enum Plec {
  MALE, FEMALE
}

public class Human implements Comparable<Human> {

  private final String name;
  private final String lastName;
  private final Plec plec;

  public Human(String name, String lastName, Plec plec) {
    this.name = name;
    this.lastName = lastName;
    this.plec = plec;
  }

  public String getName() {
    return name;
  }

  public String getLastName() {
    return lastName;
  }

  public Plec getPlec() {
    return plec;
  }

  @Override
  public String toString() {
    return "dzien3.Human [name=" + name + ", lastName=" + lastName + "]";
  }


  @Override
  public int compareTo(Human o) {
    int compareLastName = getLastName().compareTo(o.getLastName());
    if (compareLastName == 0) {
      return getName().compareTo(o.getName());
    }
    return compareLastName;
  }

}
