package Day24_RemoveIf_DateAndTime;

import Day17_CustomClasses.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class PracticeTask {

    /*  1. Given the following arraylist of Employees:
      ArrayList<Employee> employees = new ArrayList<>();
      employees.addAll(Arrays.asList(
              new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
      ));

      employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
      employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
      employees.get(1).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
      employees.get(1).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
      employees.get(1).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

      Note: Employee class is imported from day17 package

      1.1 Write a program that can display the name and job title of each employee

      1.2 Write a program that can display the names of "Java Developers"

      1.3 Write a progam that can display the maximum and minimum salary

      1.4 Create two arraylists named femaleEmployees and maleEmployees, write a program that can add all the female employees and male emloyees to the femaleEmployees and maleEmployees arraylists
 */
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(
                new Employee("Josh", 34, 'M', "Java Developer", 100000, "A01"),
                new Employee("Emily", 40, 'F', "SDET", 90000, "A02"),
                new Employee("Conor", 38, 'M', "Project Manager", 130000, "A03"),
                new Employee("Bella", 29, 'F', "Java Developer", 95000, "A04"),
                new Employee("Jimmy", 54, 'M', "Data Analyst", 105000, "A05")
        ));
        for (Employee employee : employees) {
            System.out.println(employee.name + ": " + employee.jobTitle);
        }
        for (Employee employee : employees) {
            if (employee.jobTitle.equals("Java Developer"))
                System.out.println(employee.name);
        }
        double max = employees.get(0).salary;
        double min = employees.get(0).salary;
        for (Employee employee : employees) {
            if (max < employee.salary) {
                max = employee.salary;
            }}
            System.out.println("Max salary: " + max);

            for (Employee emp : employees) {
                if (min > emp.salary) {
                    min = emp.salary;
                }}
                System.out.println("Min  salary: " + min);

            ArrayList<String> female=new ArrayList<>();
            ArrayList<String> male=new ArrayList<>();
        for (Employee emp : employees) {
            if(emp.gender=='M'){
                male.add(emp.name);
            }
            else female.add(emp.name);

        }
        System.out.println(male);
        System.out.println(female);
        employees.removeIf(each->each.salary>100000); // no need for an additional for loop this is a for loop  which checks the salary of employee objects
        }

    }
