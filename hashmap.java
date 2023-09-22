package musclebuffnutrition;
import java.util.ArrayList;
import java.util.HashMap;
public class hashmap {
  public static void main(String[] args) {
    HashMap<String,Integer> map = new HashMap<>();
    map.put("Bharat", 26);
    map.put("Mitul", 27);
    map.put("Renu", 36);
    map.put("kittu", 30);
    System.out.println(map.size());
    
    System.out.println(map.get("Renu"));
    ArrayList<Integer> AL = new ArrayList<>();
    ArrayList<String> fruits = new ArrayList<>();

    // Add some elements
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Cherry");
    fruits.add("Date");

    // Iterate through the ArrayList using a regular for loop
    for (int i = 0; i < fruits.size(); i++) {
        String fruit = fruits.get(i);
        System.out.println("Fruit at index " + i + ": " + fruit);
    }
    }  
}
