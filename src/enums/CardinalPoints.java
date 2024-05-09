package enums;

public enum CardinalPoints {
    NORTH("N"), SOUTH("S"), WEST("W"), EAST("E");

    private final String symbol;

    CardinalPoints(String symbol) {
        this.symbol = symbol;
    }

    public String toDirection() {
        return switch (this) {
            case NORTH -> "UP";
            case SOUTH -> "DOWN";
            case EAST -> "RIGHT";
            case WEST -> "LEFT";
        };
    }

    public static CardinalPoints fromNameCaseInsensitive(String name) {
        CardinalPoints[] values = CardinalPoints.values();
        for (CardinalPoints value : values) {
            if (value.name().equalsIgnoreCase(name)) {
                return value;
            }
        }
        return null;
    }

    public static CardinalPoints fromSymbolCaseInsensitive(String symbol) {
        CardinalPoints[] values = CardinalPoints.values();
        for (CardinalPoints value : values) {
            if (value.symbol.equalsIgnoreCase(symbol)) {
                return value;
            }
        }
        return null;
    }
}
