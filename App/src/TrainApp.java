import java.util.LinkedHashSet;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("==========================================");

        // 1. Create a LinkedHashSet to store unique bogies in order
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // 2. Attach bogies in sequence
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // 3. Intentionally attempt to add a duplicate (Sleeper)
        // The LinkedHashSet will ignore this because "Sleeper" already exists.
        trainFormation.add("Sleeper");

        // 4. Display the final formation
        System.out.println("\nFinal Train Formation:");
        System.out.println(trainFormation);

        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("\nUC5 formation setup completed...");
    }
}