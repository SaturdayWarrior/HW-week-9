import java.util.ArrayList;
import java.util.List;

public class RetrieveArray {

    public static void main(String[] args) {
        List<String>listStrings = new ArrayList<>();
        listStrings.add("Red");
        listStrings.add("Blue");
        listStrings.add("Yellow");
        listStrings.add("Pink");
        listStrings.add("Black");
        //print the list
        System.out.println(listStrings);
        //Retrive the first and first and third element
        String element = listStrings.get(0);
        System.out.println("First value: "+element);
        element = listStrings.get(2);
        System.out.println("Third element: "+element);
    }
}
