import java.util.HashMap;
import java.util.Map;

public class TrainApp {
    public static void main(String[] args) {
        // Step 1: Initialize Header Display
        System.out.println("==========================================");
        System.out.println(" UC6 - Map Bogie to Capacity (HashMap)");
        System.out.println("==========================================");
        System.out.println();

        // Step 2: Create a HashMap to store Bogie Name (String) and Capacity (Integer)
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // Step 3: Insert entries using the put() method
        // Note: HashMaps do not maintain insertion order. 
        // Use LinkedHashMap if a specific order is required.
        bogieCapacityMap.put("First Class", 24);
        bogieCapacityMap.put("Cargo", 120);
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 56);

        // Step 4: Display the details
        System.out.println("Bogie Capacity Details:");

        // Step 5: Iterate through the map using entrySet()
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Step 6: Completion Message
        System.out.println();
        System.out.println("UC6 bogie-capacity mapping completed...");
    }
}
