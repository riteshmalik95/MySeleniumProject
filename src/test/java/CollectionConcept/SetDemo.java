package CollectionConcept;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> numbers=new HashSet<>();
//        Set<Integer> numbers=new HashSet<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(8);
        numbers.add(17);
        numbers.add(7);
        numbers.add(2);
        numbers.add(12);
        numbers.add(4);
        numbers.add(null);

        System.out.println(numbers);
        numbers.remove(7);
        System.out.println(numbers);
        numbers.add(18);
        System.out.println(numbers);
        numbers.add(-1);
        System.out.println(numbers);
        numbers.add(-5);
        System.out.println(numbers);
    }
}
