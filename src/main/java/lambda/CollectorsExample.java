package lambda;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsExample {

    public static void main(String[] args) {
        Book[] tableBook = {new Book("abc"), new Book("cde"), new Book("efg"), new Book("cde")};

        List<Book> listBook = Stream.of(tableBook).collect(Collectors.toList());
        System.out.println(listBook);

        Set<Book> setBook = Stream.of(tableBook).collect(Collectors.toSet());
        System.out.println(setBook);

        Long countBook = Stream.of(tableBook).collect(Collectors.counting());
        System.out.println(countBook);

        Map<String, List<Book>> bookPerName = Stream.of(tableBook)
                .collect(Collectors.groupingBy(book -> book.getName(), Collectors.toList()));
        System.out.println(bookPerName);
    }

}

class Book {
    final String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book [name=" + name + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
}
