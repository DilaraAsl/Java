package Day25_ConstructorsAndDateFormatting;

public class Pizza {
    public char size;
    public int  numberOfCheeseTopping,numberOfPepperoniTopping;
    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping)
    {
     this.size=size;
     this.numberOfCheeseTopping=numberOfCheeseTopping;
     this.numberOfPepperoniTopping=numberOfPepperoniTopping;
    }
    public double calculateCost(){
        /* S: $10 + $2 per topping
           M: $12 + $2 per topping
           L: $14 + $2 per topping
*/      double totalCost=0;
        switch(size){

            case 'S':
                totalCost=10+2*numberOfCheeseTopping+2*numberOfPepperoniTopping;
                break;
            case 'M':
                totalCost=12+2*numberOfCheeseTopping+2*numberOfPepperoniTopping;
                break;
            case 'L':
                totalCost=14+2*numberOfCheeseTopping+2*numberOfPepperoniTopping;
                break;
        }
        return totalCost;
        }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                " Total cost : "+calculateCost()+
                '}';
    }
}

