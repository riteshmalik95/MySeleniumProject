package Homework;

import java.util.HashMap;

public class SpecialStrings2 {

    public static void main(String[] args) {
        String s1 = "aabaccdeaabb";

       
        HashMap<Character, Integer> map = new HashMap<>();

        // Traverse string
        for (char ch : s1.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1); 
            } else {
                map.put(ch, 1);
            }
        }

       
        for (char key : map.keySet()) {
            System.out.println(key + " ---> " + map.get(key));
        }
    }
}

//package Homework;
//
//import java.util.HashMap;
//
//public class SpecialStrings2 {
//
//    public static void main(String[] args) {
//        String s1 = "aabaccdeaabb";
//
//        // Create a HashMap to store character counts
//        HashMap<Character, Integer> map = new HashMap<>();
//
//        // Traverse string
//        for (char ch : s1.toCharArray()) {
//            if (map.containsKey(ch)) {
//                map.put(ch, map.get(ch) + 1); // increment count
//            } else {
//                map.put(ch, 1); // first occurrence
//            }
//        }
//
//        // Print results
//        for (char key : map.keySet()) {
//            System.out.println(key + " ---> " + map.get(key));
//        }
//    }
//}
//
