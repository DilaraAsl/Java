package Day29_Inheritance.AnimalTask;

public class AnimalTester {
    public static void main(String[] args) {
        Cat myCat=new Cat("tig","none",'F','S',10);
        myCat.scratch();
        System.out.println(myCat.toString());
        Dog myDog=new Dog("fluffy","terrier",'M','M',7);
        myDog.sleep();
        Tiger myTiger=new Tiger("hunter","",'M','M',7);
        myTiger.eat();
        myTiger.hunt();
        System.out.println(myDog.toString());
        System.out.println(myTiger.toString());
    }
}
