package GroupExercises;

import java.util.Scanner;

public class AnimalDishName {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("enter an animal name");
        String animalName = kb.nextLine();
        System.out.println("enter a dish name");
        String dishName = kb.nextLine();
        System.out.println(isDishName(animalName, dishName));

    }

    public static boolean isDishName(String animal, String dish) {
        boolean isDish = false;
        if (dish.startsWith("" + animal.charAt(0)) && dish.endsWith("" + animal.charAt(animal.length() - 1))) {
            isDish = true;
        }
        return isDish;
    }
}
