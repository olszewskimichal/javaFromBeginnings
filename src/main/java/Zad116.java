import java.util.Optional;

public class Zad116 {

  public static void main(String[] args) {
    User user = new User(null, "email", null);
    System.out.println(user.getName());
    System.out.println(user.getId());
  }
}

class User {

  private final Long id;
  private final String email;
  private final String name;

  public User(Long id, String email, String name) {
    this.id = id;
    this.email = email;
    this.name = name;
  }

  public Long getId() {
    return Optional.ofNullable(id)
        .orElseThrow(() -> new IllegalArgumentException("Nie mo�e istnie� u�ytkownik bez identyfikatora"));
  }

  public String getName() {
    return Optional.ofNullable(name).orElse("Nieznany uzytkownik");
  }

  public String getEmail() {
    return email;
  }
}