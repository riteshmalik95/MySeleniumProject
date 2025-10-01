package CollectionConcept;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> empdata=new HashMap<>();
        empdata.put(1,"Ritesh");
        empdata.put(2,"Rohan");
        empdata.put(3,"Rohit");
        empdata.put(4,"Ravina");
        for(Map.Entry<Integer,String> employee:empdata.entrySet()){
            System.out.println("Id No- "+employee.getKey()+" Employee Name- "+employee.getValue());
        }
    }
}
