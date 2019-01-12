package dzien7.generyki;

public class GenerycznaWalizka2<T extends Number> {

  private T przedmiot;

  public T getPrzedmiot() {
    return przedmiot;
  }

  public void setPrzedmiot(T przedmiot) {
    this.przedmiot = przedmiot;
  }
}
