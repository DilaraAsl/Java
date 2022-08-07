package Day24_RemoveIf_DateAndTime;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class PersonTester {
    public static void main(String[] args) {
        Person[] people={new Person("Java",'M', LocalDate.of(1989,2,25)),
                new Person("Lava",'F',LocalDate.of(1987,1,1)),
                new Person("Kava",'M',LocalDate.of(1977,12,12)),
                new Person("Mana",'M',LocalDate.of(1977,12,12)),
                new Person("Tama",'M',LocalDate.of(1955,8,22))};

        ArrayList<Person> list=new ArrayList<>();
        list.addAll(Arrays.asList(people));
        for (Person person : list) {
            System.out.println(person.name+" "+person.age);
        }
        list.removeIf(each->each.age>55);
        System.out.println(list);
    }
}
