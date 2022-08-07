package JavaLab_07_ClassesAndObjects;

public class Address {
    public String buildingNo, streetName, city, state, zipcode;

    public Address(String buildingNo, String streetName, String city, String state, String zipcode) {
        this.buildingNo = buildingNo;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }


    public String toString() {
        return "Address{" +
                "buildingNo='" + buildingNo + '\'' +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode=" + zipcode +
                '}';
    }
}
