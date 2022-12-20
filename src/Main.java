import java.util.*;

public class Main {
    @SuppressWarnings("unchecked")

    public static void main(String[] args) {

        ArrayList list = new ArrayList(new ArrayList<>());
        list.add("java");
        list.add("python");
        list.add("javascript");

        for (Object obj : list)
            System.out.println(obj);

        System.out.println("\nThe built-in annotation is used to suppress warning");
    }
}