package Day25_ConstructorsAndDateFormatting;
import Day17_CustomClasses.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class MorningTasks {
   /* 1. Give the following array of dogs
    Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
    dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
    dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
    dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
    dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
    dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
    dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

    Note: Dog class is imported from day17 package

            1.1 Create an arrayList named smallDogs, and add all the dog objects with the size of small from the dogs array to smallDogs arrayList

    Note: DO NOT use any loops

    1.2 Create an arrayList named youngDogs, and add all the dog objects with the age of 4 or less from the dogs array to youngDogs arrayList

    Note: DO NOT use any loops

    1.3 Create an arrayList named femaleDogs, and add all the dog objects with the gender of 'F' the dogs array to femaleDogs arrayList

    Note: DO NOT use any loops

    1.4 Create an arrayList named maleDogs, and add all the dog objects with the gender of 'M' the dogs array to maleDogs arrayList

    Note: DO NOT use any loops*/
   public static void main(String[] args) {
       Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
       dogs[0].setInfo("Max", "Husky", "Medium",'M', 1, "Gray");
       dogs[1].setInfo("Chloe", "Golden Retriever", "Large", 'F', 2, "Gold");
       dogs[2].setInfo("Molly", "Beagle", "Small", 'F', 3, "White");
       dogs[3].setInfo("Oliver", "Bulldog", "Medium", 'M', 4, "Black");
       dogs[4].setInfo("Bella", "Bichon Frise", "Small", 'F', 5, "White");
       dogs[5].setInfo("Loki", "Chow Chow", "Medium", 'M',6 , "Gold");

        // Dog[] assigned to smallDogs ArrayList<>
       ArrayList<Dog> smallDogs=new ArrayList<>(Arrays.asList(dogs));

        smallDogs.removeIf(each->each.size.equalsIgnoreCase("Medium")||each.size.equalsIgnoreCase("Large"));

       System.out.println(smallDogs);

        ArrayList<Dog> youngDogs=new ArrayList<>(Arrays.asList(dogs));
        youngDogs.removeIf(each->each.age>4);
       System.out.println(youngDogs);

       ArrayList<Dog> femaleDogs=new ArrayList<>(Arrays.asList(dogs));
       femaleDogs.removeIf(each->each.gender=='M');
       System.out.println(femaleDogs);
      /*
        ArrayList<Dog> maleDogs=new ArrayList<>(Arrays.asList(dogs));
       maleDogs.removeIf(each->each.gender=='F');
        System.out.println(maleDogs);
        Using a Loop to assign values from Dog Array to maleDogs ArrayList
       */
       ArrayList<Dog> maleDogs=new ArrayList<>();
       for (Dog each : dogs) {
           if(each.gender=='M'){
               maleDogs.add(each);
           }
       }
       System.out.println(maleDogs);

       ArrayList<Dog> list=new ArrayList<>(Arrays.asList(dogs));
       list.removeIf(each->each.size.equalsIgnoreCase("Medium")||each.size.equalsIgnoreCase("Large"));
        dogs=list.toArray(new Dog[0]);// 0 or list.size()
       System.out.println(Arrays.toString(dogs));
   }
}