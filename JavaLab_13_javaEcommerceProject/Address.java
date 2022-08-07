package JavaLab_13_javaEcommerceProject;

public class Address {
    private String streetNumber;
    private String streetName;
    private String zipcode;
    private String additionalLine;
    private String state;

    public Address(String streetNumber, String streetName, String additionalLine, String zipcode, String state) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.zipcode = zipcode;
        this.additionalLine = additionalLine;
        this.state = state;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getAdditionalLine() {
        return additionalLine;
    }

    public String getState() {
        return state;
    }
}
