package Programacion.UD9.pooUD9CasoPractico3;

public class Colores {
    public static final String RESET = "\u001B[0m"; // Reset color
    public static final String BLACK = "\u001B[30m"; // Black
    public static final String RED = "\u001B[31m"; // Red
    public static final String GREEN = "\u001B[32m"; // Green
    public static final String YELLOW = "\u001B[33m"; // Yellow
    public static final String BLUE = "\u001B[34m"; // Blue
    public static final String PURPLE = "\u001B[35m"; // Purple
    public static final String CYAN = "\u001B[36m"; // Cyan
    public static final String WHITE = "\u001B[37m"; // White
    public static final String BLACK_BACKGROUND = "\u001B[40m"; // Black background
    public static final String RED_BACKGROUND = "\u001B[41m"; // Red background
    public static final String LIGHT_GREEN = "\u001B[92m"; // Light Green
    public static final String LIGHT_YELLOW = "\u001B[93m"; // Light Yellow
    public static final String LIGHT_BLUE = "\u001B[94m"; // Light Blue
    public static final String LIGHT_PURPLE = "\u001B[95m"; // Light Purple
    public static final String LIGHT_CYAN = "\u001B[96m"; // Light Cyan
    public static final String LIGHT_WHITE = "\u001B[97m"; // Light White
    public static final String DARK_RED = "\u001B[31;2m"; // Dark Red
    public static final String DARK_GREEN = "\u001B[32;2m"; // Dark Green
    public static final String DARK_YELLOW = "\u001B[33;2m"; // Dark Yellow
    public static final String DARK_BLUE = "\u001B[34;2m"; // Dark Blue
    public static final String DARK_PURPLE = "\u001B[35;2m"; // Dark Purple
    public static final String DARK_CYAN = "\u001B[36;2m"; // Dark Cyan
    public static final String DARK_WHITE = "\u001B[37;2m"; // Dark White
    public static final String PINK = "\u001B[95m"; // Pink

    public static String color(String color, String texto) {
        return color + texto + RESET;
    }
}
