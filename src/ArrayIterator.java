import java.util.ArrayList;
import java.util.List;

public class ArrayIterator {
    public static void main(String[] args) {
        List<String > list_String = new ArrayList<String>();
        list_String .add("Red");
        list_String .add("Blue");
        list_String .add("Green");
        list_String .add("Pink");
        list_String .add("Black");
        //print the list
        for (String value: list_String) {
            System.out.println(value);

        }
    }
}
