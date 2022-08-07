package XtraTasks.LiangCh10_2;

public class Person {
    private String name;
    private String address;
    private String email;

    public Person(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }


    public String toString() {
        return getClass().getSimpleName() +
                " name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'';
    }
}
