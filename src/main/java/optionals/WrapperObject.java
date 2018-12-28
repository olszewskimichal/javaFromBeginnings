package optionals;

public class WrapperObject {

  private NullObject object;

  public NullObject getObject() {
    return object;
  }

  public void setObject(NullObject object) {
    this.object = object;
  }
}

class NullObject {

  private final String name;

  public NullObject(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

}
