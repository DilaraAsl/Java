package JavalLab_07_ClassesAndObjects;

public class Car {
    // create an instance variable if need to store different variables for each object
    public String brand;
    public int year;
    public String color;
    public double price;

    public Car(String brand, int year, String color, double price) {
        this.brand = brand;
        this.year = year;
        this.color = color;
        this.price = price;
    }
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
    public void drive(){

        System.out.println("Model "+this.brand+"\n Production year: "+this.year);
    }


}
