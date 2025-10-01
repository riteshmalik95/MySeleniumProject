package CollectionConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        int[] arr = new int[6];
//        List<Integer> numbers1=new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
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
        System.out.println(numbers.remove(3));
        System.out.println(numbers);
        System.out.println(numbers.add(19));
        System.out.println(numbers);

//        System.out.println(numbers.get(5));
//        for(int i=0;i< numbers.size();i++){
//            System.out.println(numbers.get(i));// allowed
//        }
//        for(int num:numbers){//not allowed null values
//            System.out.println(num);
//        }
//                for(Integer num:numbers){//allowed null values
//            System.out.println(num);
//        }
//        Iterator <Integer> num=numbers.iterator();//Allows null values
//        while (num.hasNext()){
//            System.out.println(num.next());
//        }
//        //Lambda Expressions
//        numbers.forEach(nums-> System.out.println(nums));
//    }
    }
}
//package CollectionConcept;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//
//public class ListDemo {
//    public static void main(String[] args) {
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(4);
//        numbers.add(5);
//        numbers.add(8);
//        numbers.add(17);
//        numbers.add(7);
//        numbers.add(2);
//        numbers.add(12);
//        numbers.add(4);
//        numbers.add(null); // Adding a null value
//
//        // Option 1: Index-based loop (works fine, prints null too)
//        System.out.println("---- Index-based loop ----");
//        for (int i = 0; i < numbers.size(); i++) {
//            System.out.println(numbers.get(i));
//        }
//
//        // Option 2: Enhanced for loop with Integer (safe with nulls)
//        System.out.println("---- Enhanced for loop ----");
//        for (Integer num : numbers) {
//            System.out.println(num);
//        }
//
//        // Option 3: Iterator (also safe with nulls)
//        System.out.println("---- Iterator ----");
//        Iterator<Integer> it = numbers.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
//    }
//}
