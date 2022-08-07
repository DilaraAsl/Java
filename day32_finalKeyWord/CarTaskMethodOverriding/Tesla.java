package day32_finalKeyWord.CarTaskMethodOverriding;

import java.util.ArrayList;
import java.util.Arrays;

public class Tesla extends Car {


    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);

    }

    @Override
    public void setPrice(double price) {

        if (price <= 50000) {
            System.err.println("Invalid price ");
            System.exit(1);
        }
        super.setPrice(price);
    }

    @Override
    public void setModel(String model) {
      /*  if (!model.equalsIgnoreCase("Model S") && !model.equalsIgnoreCase("Model Y") && !model.equalsIgnoreCase("Model 3")) {
            System.out.println("invalid model " + model);
        }*/

        ArrayList<String> models = new ArrayList<>(Arrays.asList("Model S", "Model Y", "Model 3"));
        if (models.contains(model)) {
            System.out.println("invalid model " + model);
            System.exit(1);
        }
        super.setModel(model);
    }

    @Override
    public void setColor(String color) {
       /* if (!color.equalsIgnoreCase("white") && !color.equalsIgnoreCase("red") && !color.equalsIgnoreCase("black")
                && !color.equalsIgnoreCase("blue") && !color.equalsIgnoreCase("green")) {
            System.err.println("invalid color ");
            System.exit(1);
        }*/
        String[] colors = {"white", "red", "black", "blue", "green"};
        if (!Arrays.asList(colors).contains(color)) {
            System.err.println("invalid color ");
            System.exit(1);
        }
        super.setColor(color);


    }


    @Override
    public void setYear(int year) {
        if (year < 2008) {
            System.err.println("invalid year!!! " + year);
            System.exit(1);
        }
        super.setYear(year);
    }

    @Override
    public void start() {
        System.out.println(" Say: Start!!!" + getMake() + " " + getModel());
    }

   /*Extra Conditions for the variables:
        1. Model of tesla can only be set to one of the followings:
        {"Model S", "Model Y", "Model x", "Model 3" };
        2. color of tesla can only be set to one of the followings:
        {"White", "Red", "Black", "Silver", "Blue", "Brown", "Green"}
        3. year of the tesla can not be less than 2008
        4. price of tesla can not be less than 50k */
}
