package XtraTasks.enums;

public class CerealTester {
    public static void main(String[] args) {
        System.out.println(Cereals.REESEES_PUFFS.levelOfDeliciousness);
        for (Cereals each : Cereals.values()) {  //Cereals.value().for ==>for each loop
            System.out.println(each.price);

        }
    }
}
