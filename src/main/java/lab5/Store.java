package lab5;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<FlowerBucket> flowerBuckets = new ArrayList<>();

    public void addFlowerBucket(FlowerBucket bucket) {
        flowerBuckets.add(bucket);
    }

    public List<FlowerBucket> search (Flower flower) {
        return flowerBuckets.stream()
            .filter(bucket -> bucket.getPrice() > 0)
            .toList();
    }
}
