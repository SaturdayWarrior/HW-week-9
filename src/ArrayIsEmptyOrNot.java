import java.util.ArrayList;
import java.util.List;

public class ArrayIsEmptyOrNot {
    public static void main(String[] args) {
        List<String> listStrings = new ArrayList<>();
        listStrings.add("Red");
        listStrings.add("Blue");
        listStrings.add("Yellow");
        listStrings.add("Pink");
        listStrings.add("Black");
        System.out.println("Original array list: " + listStrings);
        System.out.println("Checking the above array list is empty or not! "+ listStrings.isEmpty());
        listStrings.removeAll(listStrings);
        System.out.println("Array list after remove all element "+ listStrings);
        System.out.println("Checking the above array list is empty or not! "+ listStrings.isEmpty());


    }
}