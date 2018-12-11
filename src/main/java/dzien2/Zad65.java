package dzien2;

public class Zad65 {
    public enum Direction {
        NORTH('N'), EAST('E'), SOUTH('S'), WEST('W');
        private char symbol;

        private Direction(char symbol) {
            this.symbol = symbol;
        }

        public static Direction valueFromSymbol(char c) {
            for (Direction direction : values()) {
                if (direction.symbol == c)
                    return direction;
            }
            return null;
        }

    }

    public static void main(String[] args) {
        System.out.println(Direction.valueFromSymbol('N'));
    }
}
