package ro.fasttrackit.curs19;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainStandard {
    public static void main(String[] args) {
        filterOperation(a -> a % 2 == 0);
        filterOperation(a -> a % 2 != 0);
        filterOperation(x -> x < 3);

        consumeElements(x -> System.out.println(x));
        consumeElements(x -> System.out.println("$" + x));

        supplyString(() -> List.of("a", "b", "c"));
    }

    public static void supplyString(Supplier<List<String>> supply) {
        for (String elem : supply.get()) {
            System.out.println(elem);
        }
    }

    public static void consumeElements(Consumer<Integer> consumer) {
        int[] ints = {1, 2, 3, 4, 5};
        for (int elem : ints) {
            consumer.accept(elem);
        }
    }

    public static void filterOperation(Predicate<Integer> filter) {
        int[] ints = {1, 2, 3, 4, 5};
        for (int elem : ints) {
            if (filter.test(elem)) {
                System.out.println(elem);
            }
        }
    }
}
