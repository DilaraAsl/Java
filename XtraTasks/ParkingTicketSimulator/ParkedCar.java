package XtraTasks.ParkingTicketSimulator;

public class ParkedCar {
    private String make;
    private String model;
    private String color;
    private String licenseNo;
    private int min;

    public ParkedCar(String make, String model, String color, String licenseNo, int min) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.licenseNo = licenseNo;
        this.min = min;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public int getMin() {
        return min;
    }
}
