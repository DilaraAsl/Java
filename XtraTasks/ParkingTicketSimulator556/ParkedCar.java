package XtraTasks.ParkingTicketSimulator556;

import java.sql.ClientInfoStatus;

public class ParkedCar {
    private String make, licenseNo;
    private int noOfMin;
    public void setMake(String make){
        this.make=make;
    }
    public String getMake(){
        return make;
    }
    public void setLicenseNo(String licenseNo){
        this.licenseNo=licenseNo;
    }
    public String getLicenseNo(){
        return licenseNo;
    }

    public int getNoOfMin() {
        return noOfMin;
    }

    public void setNoOfMin(int noOfMin) {
        this.noOfMin = noOfMin;
    }

    public ParkedCar(String make, String licenseNo, int noOfMin){
        setMake(make);
        setLicenseNo(licenseNo);
        setNoOfMin(noOfMin);
    }

   public ParkedCar(ParkedCar carObj){
        make=carObj.make;
       licenseNo=carObj.licenseNo;
       noOfMin=carObj.noOfMin;
   }
    public String toString() {
        return "ParkedCar{" +
                "make='" + getMake() + '\'' +
                ", licenseNo='" + getLicenseNo() + '\'' +
                ", noOfMin=" + getNoOfMin() +
                '}';
    }
}
