package flowerstore;

import lombok.Getter;

/**
 * Enum representing the color of a flower.
 */
@Getter
public enum FlowerColor {

    /**
     * Red flower color.
     */
    RED("#FF0000"),

    /**
     * White flower color.
     */
    WHITE("#FFFFFF"),

    /**
     * Yellow flower color.
     */
    YELLOW("#FFFF00");

    /**
     * The color code representing the flower color.
     */
    private final String code;

    /**
     * Constructs a FlowerColor with the specified color code.
     *
     * @param code the hexadecimal color code
     */
    FlowerColor(final String code) {
        this.code = code;
    }
}
