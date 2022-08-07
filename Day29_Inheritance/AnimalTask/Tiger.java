package Day29_Inheritance.AnimalTask;

public class Tiger extends Animal {
    public Tiger(String name, String breed, char gender, char size, int age){
        super(name,breed,gender,size,age);
        setBreed(breed);
    }
    public void hunt(){
        System.out.println(getName()+" is hunting");
    }


}
