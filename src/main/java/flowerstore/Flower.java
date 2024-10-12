package flowerstore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Represents a flower with specific properties like color, type, price, and sepal length.
 * This class is intended to be extended by specific types of flowers (e.g., Rose, Tulip).
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Flower {

    /**
     * The color of the flower.
     */
    private FlowerColor color;

    /**
     * The type of flower.
     */
    private FlowerType flowerType;

    /**
     * The price of the flower.
     */
    private double price;

    /**
     * The length of the flower's sepal.
     */
    private double sepalLength;

    /**
     * Copy constructor to create a new flower based on an existing one.
     *
     * @param flower the flower to copy
     */
    public Flower(final Flower flower) {
        this.color = flower.color;
        this.flowerType = flower.flowerType;
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
    }

    /**
     * Gets the color code of the flower.
     *
     * @return the color code as a String
     */
    public String getColor() {
        return color.getCode();
    }
}
