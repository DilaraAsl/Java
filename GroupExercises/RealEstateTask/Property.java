package GroupExercises.RealEstateTask;

public abstract class Property {
    private String name;

    public abstract double area();

    public Property(String name) {
        setName(name);
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()) {
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public String getName() {

        return name;
    }


    public String toString() {
        return name;

    }
}
