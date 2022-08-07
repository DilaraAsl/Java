package day27_AccessModifiers;

public class Iphone {
    public static String brand;
    public String model, size, color;
    public double price;
    public static String OS;
    public static boolean isSmartPhone;
    public static String madeIn;
    public static String designedIn;

    static {
        brand = "Iphone";
        isSmartPhone = true;
        madeIn = "China";
        designedIn = "USA";
        OS="Apple IOS";
    }

    public Iphone(String model, String size, String color, double price) {
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }
    public static void printOperatingSystem(){
        System.out.println(OS);
    }
    public static void call(long phoneNumber){
        System.out.println("Calling this no: "+phoneNumber);
    }
    public static void faceTime(String email){
        System.out.println("Face timing this email: "+email);
    }


    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
