package Day18_GarbageCollection;

public class Pizza {
    public char size;
    public int noOfCheeseTop, numberOfPepTop;

    public Pizza(char size, int noOfCheeseTop, int numberOfPepTop) {
        this.size = size;
        this.noOfCheeseTop = noOfCheeseTop;
        this.numberOfPepTop = numberOfPepTop;
    }

    //it calculates the total price of a pizza
    public double calcCostOf(){ // instance method because for each object information will change it is not static
        double totalPrice=0;

        switch(size){

            case 'S':
            case 's':
                totalPrice=10+2*(noOfCheeseTop+numberOfPepTop);
                break;

            case 'M':
            case 'm':
                totalPrice=12+2*(noOfCheeseTop+numberOfPepTop);
                break;

            case 'L':
            case 'l':
                totalPrice=14+2*(noOfCheeseTop+numberOfPepTop);
                break;

            default:
                System.err.println("invalid size!!!"+size);
        }
        return totalPrice;
    }

// it displays the information
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", noOfCheeseTop=" + noOfCheeseTop +
                ", numberOfPepTop=" + numberOfPepTop +
                ", total price=" + calcCostOf() +
                '}';
    }


}
