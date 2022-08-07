package XtraTasks.enums;

public enum Cereals {
    CAPTAIN_CRUNCH(45, 5.00),
    FRUIT_LOOPS(33, 5.50),
    REESEES_PUFFS(85, 6.25),
    COCOA_PUFFS(90, 6.50);
    final int levelOfDeliciousness;
    final double price;

    Cereals(int levelOfDeliciousness, double price) {
        this.levelOfDeliciousness = levelOfDeliciousness;
        this.price = price;
    }

}
