package dzien8.lambda;

import java.time.LocalDateTime;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        IsWorldEnd function = (LocalDateTime time) ->
                time.isAfter(LocalDateTime.of(2019, 1, 13, 11, 47));
        System.out.println(function.isOver(now));
    }
}
