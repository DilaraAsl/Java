package day28_Encapsulation.encapsulation;

public class Student {
    public int age;

    private int  privateAge;
    private String name;



    public int getAge(){
        if(privateAge==0){
            System.err.println("Age has not been set");
            System.exit(1); // there is an issue with the code
        }
        return privateAge;

    }
    public void setAge(int age){
        if(age<7){
            System.err.println("Invalid age "+privateAge);
          //  return; // return statement exits the method
          //  System.exit(0);// program exited without an issue if 1
            System.exit(1);   // 1 program exited with an issue
        }
        this.privateAge=age;
    }

    public String getName() {
        if(name==null){ // no need to use equals method
            System.err.println("Name has not been set");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {
        boolean hasDigit=false;

        for(char each:name.toCharArray()){
            if(Character.isDigit(each)){
                hasDigit=true;
                break;
            }
        }
        if(hasDigit){
            System.err.println("The name has a digit ");
            System.exit(1);
        }

        this.name = name;
    }
}
