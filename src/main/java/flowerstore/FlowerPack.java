package flowerstore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Represents a pack of flowers with a specific type and count.
 */
@Getter
@Setter
@NoArgsConstructor
public class FlowerPack {

    /**
     * The type of flower in this pack.
     */
    private Flower flower;

    /**
     * The number of flowers in this pack.
     */
    private int count;

    /**
     * Constructs a new flower pack with the specified flower type and count.
     *
     * @param flower the type of flower in the pack
     * @param count the number of flowers in the pack
     */
    public FlowerPack(final Flower flower, final int count) {
        this.flower = new Flower(flower);
        this.count = count;
    }

    /**
     * Calculates the total price of the flower pack.
     *
     * @return the total price of the flower pack
     */
    public double getPrice() {
        return flower.getPrice() * count;
    }
}
