package Day17_CustomClasses;

public class Address {
   public String buildingNumber, street, city, state, zipCode;

    public Address(String buildingNumber, String street, String city, String state, String zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }


    public String toString() {
        return "Address:\n" +
                buildingNumber + " "+ street + " \n"
                + city +" " + state + ", "  + zipCode ;
    }
}
