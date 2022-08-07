package day41_maps;

import day33_abstraction.EmployeeTask.Employee;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {
        List<int[]> list = new ArrayList<>();
        int[] array = {1, 2, 3};
        list.add(array);
        List<Queue<Integer>> list1 = new ArrayList<>();

        List<Integer> listItems = new ArrayList<>();
        listItems.addAll(Arrays.asList(1, 2, 3, 5, 8));
        List<Integer> listItems2 = new ArrayList<>();
        listItems2.addAll(Arrays.asList(1, 2, 3, 10, 8));
        List<List<Integer>> listOfList = new ArrayList<>();
        listOfList.addAll(Arrays.asList(listItems, listItems2));
        System.out.println(listOfList);

        //Iterator<List<Integer>> it =listOfList.iterator();// if you need to remove from the collection we must use iteration

        System.out.println(listOfList.get(1).get(3)); //

        for (List<Integer> eachList : listOfList) {  // not for removing elements
            for (Integer eachElement : eachList) {
                System.out.println(eachElement);
            }

        }
        System.out.println("---------------------------------------------------");

        List<Set<Integer>> listOfSets = new ArrayList<>();
        listOfSets.add(new LinkedHashSet<>());
        listOfSets.add(new LinkedHashSet<>());
        listOfSets.add(new LinkedHashSet<>());
        listOfSets.add(new LinkedHashSet<>());


        listOfSets.get(0).addAll(Arrays.asList(2, 3, 4, 20, 13));  // adds elements to the first HashSet
        listOfSets.get(1).addAll(Arrays.asList(12, 32, 44, 20, 130));
        listOfSets.get(2).addAll(Arrays.asList(21, 13, 84, 10, 13));
        System.out.println(listOfSets);
        System.out.println("---------------------------------------------------------");

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8, 10};
        List<int[]> listOfArrays = new ArrayList<>();
        listOfArrays.add(arr1);
        listOfArrays.add(arr2);
        // System.out.println(listOfArrays);
        System.out.println(Arrays.toString(listOfArrays.get(0)));

        listOfArrays.get(0)[2] = 35; // changing the first set, third item to 35

        System.out.println(Arrays.toString(listOfArrays.get(0)));

        List<List<Employee>> teams = new ArrayList<>();


    }
}
