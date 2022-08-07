package Practice_JavaLab_Day8;

import java.util.ArrayList;
import java.util.Scanner;

public class SplitBudgetTester {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Welcome to Budget Planner!");
        // Ask how many people are in the budget planner
        System.out.println("How many people will split the budget?");

        // Create user
        ArrayList<User> userList = prepareUserLists(kb);// prepareUserLists returns an object which userList will reference
        System.out.println("Added user count : " + userList.size());

        String[] optionList = prepareOptionList();
        ArrayList<Expense> expenseList = new ArrayList<>();

        while (true) {
            System.out.println("Please choose an option");
            for (int i = 0; i < optionList.length; i++) {
                System.out.println(optionList[i] + " : " + (i + 1));}

                int option = kb.nextInt();
                switch (option - 1) {

                    case 0:
                        // ask expense name, amount, user
                        Expense expense = new Expense();
                        System.out.println("Expense name:");
                        expense.expenseName = kb.next();
                        System.out.println("Amount : ");
                        expense.amount = kb.nextInt();
                        System.out.println("User who is responsible for the expense: ");
                        expense.userWhoSpent = kb.next();
                        for (User each : userList) { // prints the user list
                            System.out.println("id: " + userList.indexOf(each) + "name: " + each.name);// user id is the index no which the client will enter in

                        }
                        int userId = kb.nextInt();
                        User user = userList.get(userId); // re-referenced user reference value to the user name--we created the userList now we are mapping the expense with the user name
                        expense.userWhoSpent = user.name; // userWhoSpent is initialized with name

                        expenseList.add(expense);// we added expense object
                        break;
                    case 1:
                        System.out.println("Name that you would like to search: ");
                        String userSearch = kb.next();
                        User myUser = null;
                        for (User each : userList) {
                            if (each.name.equals(userSearch)) {
                                myUser = each; // myUser references to the user object which holds the name
                                break; // when this step is complete we can go out of this loop
                            }

                        }
                        if (myUser == null) {
                            System.err.println("User does not exist!");
                        }
                        // List the expenses for each person

                        int userExpenseAmount = 0;// userExpenseAmount holds the total value of the expenses of myUser
                        int expenseCount = 0; // displays the no of expenses
                        // List specific personal expenses
                        for (int j = 0; j < expenseList.size(); j++) {
                            if (expenseList.get(j).userWhoSpent.equals(userSearch)) { // person who made the expense will be compared to user's entry
                                userExpenseAmount += expenseList.get(j).amount;// expenseList.get() will bring the j indexed object .amount will return its int value
                                expenseCount++;
                                System.out.println(expenseCount + " expense amount: " + expenseList.get(j).amount + " expense made by user : " + expenseList.get(j).userWhoSpent);
                            }
                        }
                        System.out.println(myUser.name + " spent $" + userExpenseAmount);
                        break;
                    case 2:
                        for (int j = 0; j < expenseList.size(); j++) {
                            System.out.println(j + " exp");

                        }
                        break;
                    case 3:
                        double totalAmount = 0;
                        ArrayList<Split> splitList = calculateSplitByUser(expenseList);

                        for(Split each:splitList){
                            totalAmount+=each.amount; // total expense amount to be split

                        }
                        makeSplit(totalAmount,splitList);
                        break;
                }
                break;

            }

        }


    private static void makeSplit(double totalAmount, ArrayList<Split> splitList) {
        double amount=totalAmount/splitList.size(); //total amount divided by the number of users in the split list

        for(Split each:splitList){
            if(each.amount>amount){
                System.out.println(each.userName+" needs to take back "+(each.amount-amount));
            }
            else{
                System.out.println(each.userName+"needs to give "+ (-1*(each.amount-amount)));

            }

        }
    }

    private static ArrayList<Split> calculateSplitByUser(ArrayList<Expense> expenseList) {
        ArrayList<Split> splitList = new ArrayList<>();
        for (Expense each : expenseList) {

            Split split = existSplitList(each.userWhoSpent, splitList);
            if (split != null) { // if the userWhoSpent is in the splitLit
                split.amount += each.amount;
            } else {  // add a new user if split is null
                Split willBeAdded = new Split();
                willBeAdded.userName = each.userWhoSpent;
                willBeAdded.amount = each.amount;
                splitList.add(willBeAdded);
            }
        }
        return splitList;
    }

    private static Split existSplitList(String userWhoSpent, ArrayList<Split> splitList) { // checks if the user who made expense is in the expense list if not return null
        for (Split each : splitList) {
            if (each.userName.equals(userWhoSpent))
                return each;
        }
        return null;
    }


    public static ArrayList<User> prepareUserLists(Scanner kb) { // User objects will be stored in an ArrayList which this method will return
        int userCount = kb.nextInt();
        ArrayList<User> userList = new ArrayList<>();
        for (int i = 0; i < userCount; i++) {
            User user = new User();
            System.out.println("Name: ");
            user.name = kb.next();   // user.name field holds new value
            System.out.println("Email: ");
            user.email = kb.next();   // user.email field holds new value
            userList.add(i, user);  // adds the user object into the ArrayList
        }
        return userList;
    }

    public static String[] prepareOptionList() { // create a menu which displays the options

                /*
        Creating options
        1 : Make Expense
        2 : List Specific Person Expense
        3 : List All Expenses
        4 : Make Split
        5 : List All Users
        6 : Close the budget
        */

        String[] optionList = {"Make Expense", "List Specific Person Expense", "List All Expenses", "Make Split", "List All Users", "Close the budget"};

        return optionList;

    }
}
