package GroupExercises;

public class DeclareWinner {
    public static void main(String[] args) {
        Fighter tom = new Fighter();
        tom.setInfo("Tom", 10, 2);
        Fighter harry = new Fighter();
        harry.setInfo("Harry", 5, 4);
        System.out.println(declareWinner(tom, harry, tom.name) + " wins!");
    }

    private static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        Fighter a = fighter1, b = fighter2;
        if (firstAttacker.equals(fighter2.name)) { // if fighter two is the first attacker switch a and b
            a = fighter2;
            b = fighter1;
        }
        while (true) {
            if ((b.health -= a.damagePerAttack) <= 0) return a.name + " wins"; //
            if ((a.health -= b.damagePerAttack) < -0) return b.name + " wins";
        }

    }
}
