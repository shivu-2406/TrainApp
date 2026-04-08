import java.util.LinkedHashSet;
import java.util.Set;

public class TrainApp {
    public static void main(String[] args) {
        // Step 1: Initialize Header Display
        System.out.println("==========================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies");
        System.out.println("==========================================");
        System.out.println();

        // Step 2: Create a LinkedHashSet to store unique bogies in order
        Set<String> trainFormation = new LinkedHashSet<>();

        // Step 3: Attach bogies (Initial list)
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Step 4: Attempt to attach a duplicate bogie intentionally
        // The LinkedHashSet will ignore this "Sleeper" because it already exists
        trainFormation.add("Sleeper");

        // Step 5: Display the final formation
        System.out.println("Final Train Formation:");
        System.out.println(trainFormation);

        // Step 6: Educational Notes and Completion
        System.out.println();
        System.out.println("Note:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");
        System.out.println();
        System.out.println("UC5 formation setup completed...");
    }
}