package GroupExercises.RealEstateTask;

import java.util.ArrayList;
import java.util.Arrays;

public class PropertyTester {
    public static void main(String[] args) {
        ArrayList<Property> properties = new ArrayList<>(Arrays.asList(new SquareHouse("Square House-1", 20),
                new SquareHouse("Square House-2", 25),
                new SquareHouse("Square House-3", 30),
                new RectangleHouse("Rectangle House-1", 20, 30),
                new RectangleHouse("Rectangle House-2", 20, 25),
                new CircleHouse("CircleHouse1", 15),
                new CircleHouse("CircleHouse2", 20),
                new CircleHouse("CircleHouse3", 10)));

        ArrayList<Property> customerProperties = new ArrayList<>();

        properties.removeIf(each -> each.area() < 600);


        System.out.println(properties);

    }

}
