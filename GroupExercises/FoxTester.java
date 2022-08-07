package GroupExercises;

public class FoxTester {
    public static void main(String[] args) {

        Fox fox1 = new Fox();
        Fox fox2 = new Fox();
        Fox fox3 = new Fox();
        Fox fox4 = new Fox();
        fox1.setFox("fox1", true, true, "BLACK", 0);
        fox2.setFox("fox2", true, true, "BLACK", 2);
        fox3.setFox("fox3", true, true, "BLACK", 3);
        fox4.setFox("fox4", false, true, "GRAY", 3);
   /*     findThief(fox1);
        findThief(fox2);
        findThief(fox3);
        findThief(fox4); */
        Fox[] foxes = {fox1, fox2, fox3, fox4};
        for (Fox each : foxes) {
            findThief(each); //

        }
    }

    public static void findThief(Fox fox) {
        if (fox.wearsCoat && fox.coatColor.equals("BLACK") && fox.hasAtorch && fox.bagCount == 3) {
            System.out.println(fox.name + " is one of the suspects!");
        } else {
            System.out.println(fox.name + " cleared of charges!");
        }
    }
}
