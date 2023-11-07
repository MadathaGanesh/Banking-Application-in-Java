package BankingApplication;

import java.util.ArrayList;
import java.util.Scanner;

/*
        Problem Statement
You job is to create a simple banking application.
There should be a Bank class.
It should have an arraylist of Branches
Each Branch should have an arraylist of Customer.
The Customer class should have an arraylist of Doubles (transactions) Customer:
Name, and the ArrayList of doubles.
Branch:
Need to be able to add a new customer and initial transaction amount.
Also needs to add additional transactions for that customer/branch
Bank:
Add a new branch
Add a customer to that branch with initial transaction
Add a transaction for an existing customer for that branch
Show a list of customers for a particular branch and optionally a list of their transactions
Demonstration autoboxing and unboxing in your code.
Hint: Transactions Add data validation e.g. check if exists, or does not exist, etc. Think about where you are adding the code to perform
         */
public class DriverClass {
    private static BranchClass branch=new BranchClass();
    private static ArrayList<CustomerClass> customerArray=new ArrayList<>();
    private static String name;
    private static double transactions;
    private static BankClass bank=new BankClass();
    public static void main(String[] args) {
        boolean cont=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Banking system ");
        System.out.println("Please select the options and press 0 to see options ");
        while (cont!=false){
            System.out.println("\n press any number from options ");
            showoptions();
            int choice=sc.nextInt();
            switch (choice){
                case 0:
                    showoptions();
                    break;
                case 1:
                    bank.addBranch();
                    break;
                case 2:
                    bank.addCustomerToBranch();
                    break;
                case 3:
                    bank.AddCustomerTransactions();
                    break;
                case 4:
                    bank.printBranch();
                    break;
                case 5:
                    cont=false;
            }
        }
    }
    public static void showoptions(){
        System.out.println("\t 1. Add new branch");
        System.out.println("\t 2. Add customer");
        System.out.println("\t 3. Add transaction to existing customer");
        System.out.println("\t 4. Print Summary");
        System.out.println("\t 5. Quit");
    }

}
