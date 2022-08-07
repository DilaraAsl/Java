package Day22_WrapperClasses_ArrayLists;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2); // need to pass an object to add() method
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(5);// must add integer
       // list.add('A'); cannot pass char || double
        list.add(1,13);
        list.add(3,88);
        System.out.println(list);

        ArrayList<String> studentList=new ArrayList<>();
        studentList.add("java");
        studentList.add("kava");
        studentList.add("lava");
        System.out.println(studentList.size());
        System.out.println(studentList.get(0));
        System.out.println(studentList.get(studentList.size()-1));
    }
}
