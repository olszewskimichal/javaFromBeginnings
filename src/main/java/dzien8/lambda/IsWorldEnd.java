package dzien8.lambda;

import java.time.LocalDateTime;

@FunctionalInterface
public interface IsWorldEnd {
    boolean isOver(LocalDateTime time);
}
