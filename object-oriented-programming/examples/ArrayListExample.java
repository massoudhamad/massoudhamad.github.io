import java.util.ArrayList;
import java.util.Collections;

/**
 * Java Basics: ArrayList
 * PT821 - Object-Oriented Programming
 *
 * This example demonstrates:
 * - ArrayList creation
 * - Adding, accessing, and removing elements
 * - ArrayList methods
 * - Iterating through ArrayList
 * - Difference between Array and ArrayList
 */
public class ArrayListExample {
    public static void main(String[] args) {

        // ============================================
        // 1. CREATING ARRAYLIST
        // ============================================
        System.out.println("=== Creating ArrayList ===\n");

        // ArrayList syntax: ArrayList<Type> name = new ArrayList<>();
        // Note: Must use wrapper classes (Integer, Double, etc.) not primitives

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();

        System.out.println("Empty names list: " + names);
        System.out.println("Size: " + names.size());

        // ============================================
        // 2. ADDING ELEMENTS
        // ============================================
        System.out.println("\n=== Adding Elements ===\n");

        // add() - adds element at the end
        names.add("Ali");
        names.add("Fatma");
        names.add("Hassan");
        names.add("Amina");

        System.out.println("After adding: " + names);
        System.out.println("Size: " + names.size());

        // add(index, element) - adds at specific position
        names.add(1, "Juma");  // Insert at index 1
        System.out.println("After inserting Juma at index 1: " + names);

        // Adding numbers
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("Numbers: " + numbers);

        // ============================================
        // 3. ACCESSING ELEMENTS
        // ============================================
        System.out.println("\n=== Accessing Elements ===\n");

        // get(index) - returns element at index
        System.out.println("First name (index 0): " + names.get(0));
        System.out.println("Third name (index 2): " + names.get(2));

        // Getting last element
        int lastIndex = names.size() - 1;
        System.out.println("Last name: " + names.get(lastIndex));

        // ============================================
        // 4. MODIFYING ELEMENTS
        // ============================================
        System.out.println("\n=== Modifying Elements ===\n");

        System.out.println("Before: " + names);

        // set(index, element) - replaces element at index
        names.set(0, "Ahmed");  // Replace first element
        System.out.println("After set(0, \"Ahmed\"): " + names);

        // ============================================
        // 5. REMOVING ELEMENTS
        // ============================================
        System.out.println("\n=== Removing Elements ===\n");

        System.out.println("Before removal: " + names);

        // remove(index) - removes element at index
        names.remove(1);  // Remove element at index 1
        System.out.println("After remove(1): " + names);

        // remove(Object) - removes first occurrence of object
        names.remove("Amina");
        System.out.println("After remove(\"Amina\"): " + names);

        // ============================================
        // 6. USEFUL ARRAYLIST METHODS
        // ============================================
        System.out.println("\n=== Useful ArrayList Methods ===\n");

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Apple");  // Duplicate

        System.out.println("Fruits: " + fruits);

        // size() - number of elements
        System.out.println("Size: " + fruits.size());

        // isEmpty() - check if empty
        System.out.println("Is empty? " + fruits.isEmpty());

        // contains() - check if element exists
        System.out.println("Contains 'Mango'? " + fruits.contains("Mango"));
        System.out.println("Contains 'Grape'? " + fruits.contains("Grape"));

        // indexOf() - first occurrence index (-1 if not found)
        System.out.println("Index of 'Orange': " + fruits.indexOf("Orange"));
        System.out.println("Index of 'Apple': " + fruits.indexOf("Apple"));

        // lastIndexOf() - last occurrence index
        System.out.println("Last index of 'Apple': " + fruits.lastIndexOf("Apple"));

        // clear() - removes all elements
        ArrayList<String> temp = new ArrayList<>(fruits);  // Copy
        temp.clear();
        System.out.println("After clear(): " + temp);

        // ============================================
        // 7. ITERATING THROUGH ARRAYLIST
        // ============================================
        System.out.println("\n=== Iterating Through ArrayList ===\n");

        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(85);
        scores.add(92);
        scores.add(78);
        scores.add(95);
        scores.add(88);

        // Method 1: for loop
        System.out.println("Using for loop:");
        for (int i = 0; i < scores.size(); i++) {
            System.out.println("scores[" + i + "] = " + scores.get(i));
        }

        // Method 2: for-each loop
        System.out.println("\nUsing for-each loop:");
        for (int score : scores) {
            System.out.println("Score: " + score);
        }

        // Method 3: forEach with lambda (Java 8+)
        System.out.println("\nUsing forEach with lambda:");
        scores.forEach(score -> System.out.println("Score: " + score));

        // ============================================
        // 8. SORTING ARRAYLIST
        // ============================================
        System.out.println("\n=== Sorting ArrayList ===\n");

        ArrayList<Integer> unsorted = new ArrayList<>();
        unsorted.add(64);
        unsorted.add(34);
        unsorted.add(25);
        unsorted.add(12);
        unsorted.add(22);

        System.out.println("Before sorting: " + unsorted);

        Collections.sort(unsorted);
        System.out.println("After sort (ascending): " + unsorted);

        Collections.reverse(unsorted);
        System.out.println("After reverse (descending): " + unsorted);

        // Sorting strings
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Tanzania");
        countries.add("Kenya");
        countries.add("Uganda");
        countries.add("Rwanda");

        System.out.println("\nCountries before sort: " + countries);
        Collections.sort(countries);
        System.out.println("Countries after sort: " + countries);

        // ============================================
        // 9. ARRAY VS ARRAYLIST
        // ============================================
        System.out.println("\n=== Array vs ArrayList ===\n");

        System.out.println("| Feature          | Array              | ArrayList          |");
        System.out.println("|------------------|--------------------|--------------------|");
        System.out.println("| Size             | Fixed              | Dynamic (resizable)|");
        System.out.println("| Type             | Primitives+Objects | Objects only       |");
        System.out.println("| Syntax           | int[] arr          | ArrayList<Integer> |");
        System.out.println("| Access           | arr[i]             | list.get(i)        |");
        System.out.println("| Length/Size      | arr.length         | list.size()        |");
        System.out.println("| Add element      | Not possible       | list.add(item)     |");
        System.out.println("| Remove element   | Not directly       | list.remove(i)     |");

        // ============================================
        // 10. PRACTICAL EXAMPLE: STUDENT MANAGEMENT
        // ============================================
        System.out.println("\n=== Practical Example: Student List ===\n");

        ArrayList<String> students = new ArrayList<>();

        // Add students
        students.add("Ali Mohamed");
        students.add("Fatma Hassan");
        students.add("Juma Khamis");
        students.add("Amina Omar");

        System.out.println("Class list:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ". " + students.get(i));
        }

        // Add a new student
        students.add("Hassan Salim");
        System.out.println("\nAfter adding new student:");
        System.out.println("Total students: " + students.size());

        // Remove a student who dropped
        students.remove("Juma Khamis");
        System.out.println("\nAfter removing Juma Khamis:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ". " + students.get(i));
        }

        // Search for a student
        String searchName = "Fatma Hassan";
        if (students.contains(searchName)) {
            System.out.println("\n" + searchName + " is enrolled in this class.");
        }
    }
}
