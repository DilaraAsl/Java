package utilities;
//import day27_AccessModifiers.Data;
import day27_AccessModifiers.AccessModifiers;

import static day27_AccessModifiers.Data.*;
//import static day27_AccessModifiers.Data.method3;
public class Test {
    public static void main(String[] args) {
       System.out.println(d);
       method3();
    //    Data obj=new Data();
      //  System.out.println(obj.a);
      //  obj.method1();
        System.out.println(AccessModifiers.publicData);// accessible
       // System.out.println(AccessModifiers.protectedData); protected is not always accessible outside, in different packages
       // System.out.println(AccessModifiers.defaultData); not accessible

    }
}
