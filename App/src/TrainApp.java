import java.util.ArrayList;

public class TrainApp {
    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("====================================\n");

        // Create ArrayList
        ArrayList<String> bogies = new ArrayList<>();

        // Add bogies
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + bogies + "\n");

        // Remove "AC Chair"
        bogies.remove("AC Chair");

        System.out.println("After Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + bogies + "\n");

        // Check if Sleeper exists
        System.out.println("Checking if 'Sleeper' exists:");
        boolean exists = bogies.contains("Sleeper");
        System.out.println("Contains Sleeper? : " + exists + "\n");

        // Final state
        System.out.println("Final Train Passenger Consist:");
        System.out.println(bogies + "\n");

        System.out.println("UC2 operations completed successfully...");
    }
}