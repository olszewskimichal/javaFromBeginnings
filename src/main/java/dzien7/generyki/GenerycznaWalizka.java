package dzien7.generyki;

public class GenerycznaWalizka<T> {

  private T przedmiot;

  public T getPrzedmiot() {
    return przedmiot;
  }

  public void setPrzedmiot(T przedmiot) {
    this.przedmiot = przedmiot;
  }
}
