/**
 * This package contains all classes related to the flower store application.
*/
package flowerstore;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a flower bucket that holds multiple flower packs.
 */
public final class FlowerBucket {

    /**
     * A list of flower packs in the bucket.
     */
    private List<FlowerPack> flowerPacks;

    /**
     * Creates a new flower bucket with an empty list of flower packs.
     */
    public FlowerBucket() {
        this.flowerPacks = new ArrayList<>();
    }

    /**
     * Adds a flower pack to the bucket.
     *
     * @param flowerPack the flower pack to add
     */
    public void add(final FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    /**
     * Calculates the total price of the flower bucket.
     *
     * @return the total price of all flower packs in the bucket
     */
    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }
}
