package Day18_GarbageCollection;

public class Contact {
    public String name;
    public String phoneNumber;
    public String email;


    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public void call(){
        System.out.println("Calling"+name+"now");
    }
    public void sendMessage(){
        System.out.println("Sending message to "+phoneNumber+"now");

    }
    public void sendEmail(){
        System.out.println("Sending message to"+email+"now");
    }


    public String toString() {
        return "Contact " +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'';
    }
}
