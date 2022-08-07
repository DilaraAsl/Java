package XtraTasks.ReviewTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
remove carlos from the list

 */
public class IteratorExampleTask {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Anna", "Carlos", "Bob"));
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            if (it.next().equals("Carlos")) {
                it.remove();
            }

        }
        System.out.println(names);
    }
}