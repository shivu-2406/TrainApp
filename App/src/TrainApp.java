import java.util.HashSet;

public class TrainApp {
    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("====================================\n");


        HashSet<String> bogieIDs = new HashSet<>();

        // Add bogie IDs (including duplicates)
        bogieIDs.add("BG104");
        bogieIDs.add("BG103");
        bogieIDs.add("BG102");
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG101");


        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogieIDs + "\n");


        System.out.println("Note:");
        System.out.println("Duplicates are automatically ignored by HashSet.\n");

        System.out.println("UC3 uniqueness validation completed...");
    }
}