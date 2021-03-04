package _011_tree_map.excercise.excercise_1;

import java.util.function.Consumer;

public class ConsumerImplementation implements Consumer<Product> {
    @Override
    public void accept(Product product) {
        System.out.println(product);
    }
}
