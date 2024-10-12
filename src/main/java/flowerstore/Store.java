package flowerstore;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a store that contains flower buckets.
 */
public final class Store {

    /**
     * List of flower buckets available in the store.
     */
    private final List<FlowerBucket> flowerBuckets = new ArrayList<>();

    /**
     * Adds a flower bucket to the store's inventory.
     *
     * @param bucket the flower bucket to add
     */
    public void addFlowerBucket(final FlowerBucket bucket) {
        flowerBuckets.add(bucket);
    }

    /**
     * Searches for flower buckets in the store that contain the specified flower.
     *
     * @param flower the flower to search for in the buckets
     * @return a list of flower buckets that match the search criteria
     */
    public List<FlowerBucket> search(final Flower flower) {
        return flowerBuckets.stream()
                .filter(bucket -> bucket.getPrice() > 0)
                .toList();
    }
}
