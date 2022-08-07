package JavaLab_08;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SplitterApp {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        ArrayList<User> userList = prepareUserList(kb);

        System.out.println(userList);

       /* for (String each : prepareOption()) { //prepareOption returns String[]
            System.out.println(each);
        } */

        String[] newOptionList = prepareOption();

        int chooseOption=1;
        boolean isOptionTrue=(chooseOption>0);

       while(isOptionTrue){
           System.out.println("What would you like to do? ");


           for (int i = 0; i < newOptionList.length; i++) {
               System.out.println(newOptionList[i] + " : " + (i));

           }
           chooseOption = kb.nextInt();


           switch (chooseOption) {
               case 0:
                   // ask expense name, amount, user
                   Expense expense=new Expense();
                   System.out.println("Expense name : ");
                   expense.expenseName=kb.next();
                   System.out.println("Enter the amount : ");
                   expense.amount=kb.nextDouble();
                   System.out.println("User made the expense. Enter the user id:  ");
                   // print all the users

                   for (User each : userList) {
                       System.out.println(each+" user id: "+userList.indexOf(each)+"name"+each.firstName);
                       int userId=kb.nextInt();
                      User userExpense= userList.get(userId);// user who made the expense
                      expense.user=userExpense.firstName; // assign the user who made the expense to expense object
                       ArrayList<Expense> expenseList=new ArrayList<>();
                       expenseList.add(expense);
                   }
                   continue;
               case 1:
                   continue;
               case 2:
                   continue;
               case 3:
                   continue;
               case 4:
                   continue;
               case 5:
                   System.exit(0);}

       }

        }



    public static ArrayList<User> prepareUserList(Scanner kb) { //returns ArrayList reference variable list of Users
        ArrayList<User> userList = new ArrayList<>();
        System.out.println("Welcome to Budget Planner");
        // Ask how many people are there in the budget planner?
        System.out.println("How many people are the in the budget planner");

        int noOfPeople = kb.nextInt();
        //Create the user objects and assign to arrayList
        for (int i = 0; i < noOfPeople; i++) {
            User user = new User();
            System.out.println("Name :");
            user.firstName = kb.next();
            System.out.println("Email :");
            user.email = kb.next();
            // User
            userList.add(user); //adding the object


        }
        return userList;
    }

    public static String[] prepareOption() {
        String[] optionList = {"Make expense", "List personal expense", "List all expenses", "Make Split", "Close the budget"};
        return optionList;
    }
}
