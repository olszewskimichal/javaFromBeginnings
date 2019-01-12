package dzien7.optionals;

import java.util.Optional;

public class User {
    private Long id;
    private String name;

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return Optional.ofNullable(id)
                .orElseThrow(()->new IllegalArgumentException("nie moze istniec uzytkownik bez id"));
    }

    public String getName() {
        return Optional.ofNullable(name)
                .orElse("Nieznany uzytkownik");
    }

    public static void main(String[] args) {
        User user = new User(34l, null);
        System.out.println(user.getName());
        User user2 = new User(null, null);
        user2.getId();
    }
}
