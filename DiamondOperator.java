import java.util.ArrayList;
import java.util.List;

public class DiamondOperator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>() {
            {
                add("Hello");
                add("World");
            }
        };
        
        list.forEach(System.out::println);
    }
}
