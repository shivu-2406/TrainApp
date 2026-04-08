import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// 1. Create a Bogie class with fields: name and capacity
class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() { return name; }
    public int getCapacity() { return capacity; }

    @Override
    public String toString() {
        return name + " -> " + capacity;
    }
}

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("UC7 - Sort Bogies by Capacity (Comparator)");
        System.out.println("==========================================\n");

        // 2. Create a List<Bogie> to store passenger bogies
        List<Bogie> bogies = new ArrayList<>();

        // 3. Add bogies with capacities
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        System.out.println("Before Sorting:");
        bogies.forEach(System.out::println);

        // 4. Use Comparator.comparingInt() to define sorting based on capacity
        // 5. Sort the list
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        System.out.println("\nAfter Sorting by Capacity:");
        bogies.forEach(System.out::println);

        System.out.println("\nUC7 sorting completed...");
    }
}