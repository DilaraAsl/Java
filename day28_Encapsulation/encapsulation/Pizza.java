package day28_Encapsulation.encapsulation;

public class Pizza {
    private String size;
    private int noOfCheeseTopping;
    private int noOfPepperoniTopping;

    public void setSize(String size) {
        if (!size.equalsIgnoreCase("small") && !size.equalsIgnoreCase("medium") && !size.equals("large")) {
            System.out.println("Invalid entry :" + size);
            System.exit(1);
        }
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setNoOfCheeseTopping(int noOfCheeseTopping) {
        switch (getSize()) {
            case "small":
                if (noOfCheeseTopping <= 3) {
                    this.noOfCheeseTopping = noOfPepperoniTopping;
                    break;
                }
                System.err.println("invalid entry");
                System.exit(1);
            case "medium":
                if (noOfCheeseTopping <= 4) {
                    this.noOfCheeseTopping = noOfCheeseTopping;
                    break;
                }
                System.err.println("invalid entry");
                System.exit(1);
            case "large":
                if (noOfCheeseTopping <= 5) {
                    this.noOfCheeseTopping = noOfCheeseTopping;
                    break;
                }
                System.err.println("invalid entry");
                System.exit(1);
            default:
                System.err.println("invalid entry");
                System.exit(1);
        }
    }

    public int getNoOfCheeseTopping() {
        return noOfCheeseTopping;
    }

    public void setNoOfPepperoniTopping(int noOfCheeseTopping) {
        switch (getSize()) {
            case "small":
                if (noOfCheeseTopping <= 3) {
                    this.noOfPepperoniTopping = noOfCheeseTopping;
                    break;
                }
                System.err.println("invalid entry");
                System.exit(1);
            case "medium":
                if (noOfCheeseTopping <= 4) {
                    this.noOfPepperoniTopping = noOfCheeseTopping;
                    break;
                }
                System.err.println("invalid entry");
                System.exit(1);
            case "large":
                if (noOfCheeseTopping <= 5) {
                    this.noOfPepperoniTopping = noOfCheeseTopping;
                   break;
                }
                System.err.println("invalid entry");
                System.exit(1);
            default:
                System.err.println("invalid entry");
                System.exit(1);
        }
    }

    public int getNoOfPepperoniTopping() {
        return noOfPepperoniTopping;
    }

    public Pizza(String size, int noOfCheeseTopping, int noOfPepperoniTopping) {
        setSize(size);
        setNoOfCheeseTopping(noOfCheeseTopping);
        setNoOfPepperoniTopping(noOfPepperoniTopping);
    }

    public double calcCost() {
        double cost = 0;

        switch(getSize()){
            case "small":
                cost = 10 + 2 * getNoOfCheeseTopping() + 2 * getNoOfPepperoniTopping();
                break;
            case "medium":
                cost = 12 + 2 * getNoOfCheeseTopping() + 2 * getNoOfPepperoniTopping();
                break;
            case "large":
                cost = 14 + 2 * getNoOfCheeseTopping() + 2 * getNoOfPepperoniTopping();
                break;

        }
        return cost;
    }

    public String toString() {
        return "Pizza size :" + getSize() + "\n no of cheese topping: " + getNoOfCheeseTopping() +
                "\n no of pepperoni topping: " + getNoOfPepperoniTopping() + "\n Total cost: " + calcCost();
    }
}
