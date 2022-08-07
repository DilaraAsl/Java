package day36_PolymorphismPractice;

import day34_Interface.CarTask.Audi;
import day34_Interface.CarTask.Car;
import day34_Interface.CarTask.Honda;
import day34_Interface.CarTask.Tesla;

import java.util.ArrayList;

public class CarTask {
    public static void main(String[] args) {
        Car[] cars = {
                new Honda("Pilot", "White", 2010, 25000),
                new Audi("Q6", "Red", 2014, 32000),
                new Honda("Accord", "White", 2011, 20000),
                new Audi("Q4", "Blue", 2015, 33000),
                new Audi("A7", "Black", 2019, 35000),
                new Audi("Q8", "White", 2018, 40000),
                new Audi("Q5", "Purple", 2009, 30000),
                new Audi("A4", "Black", 2011, 30000),
                new Honda("Civic", "Red", 2018, 30000),
                new Honda("CR-V", "Red", 2012, 23000),
                new Honda("HR-V", "Blue", 2019, 35000),
                new Tesla("Model 3", "White", 2015, 45000),
                new Tesla("Model Y", "Black", 2017, 65000),
                new Tesla("Model X", "White", 2016, 48000),
                new Tesla("Model X", "Blue", 2014, 48000),
        };
        for (Car each : cars) {
            if (each instanceof Honda) {
                if (each.getYear() <= 2011 && each.getYear() >= 2010) {
                    System.out.println(each.toString());
                }
            }
            if (each instanceof Audi) {
                if (each.getYear() <= 2019 && each.getYear() >= 2015) {
                    System.out.println(each.toString());
                }
            }
            if (each instanceof Tesla) {
                if (each.getYear() <= 2016 && each.getYear() >= 2015) {
                    System.out.println(each.toString());
                }
            }
        }
        double maxPrice = 0;
        String mostExpensive = "";
        for (Car each : cars) {
            if (each.getPrice() > maxPrice) {
                maxPrice = each.getPrice();
                mostExpensive = each.getMake() + " " + each.getModel() + " " + each.getYear();
            }

        }
        System.out.println("Most expensive: " + mostExpensive + " is " + maxPrice);

        double minPrice = maxPrice;
        String leastExpensive = "";
        for (Car each : cars) {
            if (each.getPrice() < minPrice) {
                minPrice = each.getPrice();
                leastExpensive = each.getMake() + " " + each.getModel() + " " + each.getYear();
            }

        }
        System.out.println("Least expensive: " + leastExpensive + " is " + minPrice);

        ArrayList<Tesla> teslaCars = new ArrayList<>();
        for (Car each : cars) {
            if (each instanceof Tesla) {
                teslaCars.add((Tesla) each);
            }

        }
        System.out.println(teslaCars);
    }

}


/*
Write a program that can display all the cars that are eligible for recall

	        					Cars that are eligible for recall:
	        							Honda: from year 2010 to 2011
	        							Audi: from year 2015 to 2019
	        							Tesla: from year 2015-2016

			1.3 Write a program that can display the car that has the highest price

			1.3 Write a program that can display the car that has the lowest price

			1.4 Create an arraylist of Tesla named teslaCars and store all the tesla cars from cars array to the arrayList:
						ArrayList<Tesla> teslaCars = new ArrayList<>()
 */
