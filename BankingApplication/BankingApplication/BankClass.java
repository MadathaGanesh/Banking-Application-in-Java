package BankingApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class BankClass {
    private Scanner sc=new Scanner(System.in);
    ArrayList<BranchClass> branchArray=new ArrayList<BranchClass>();

    public void addBranch(){
    BranchClass branch=new BranchClass();  // Creating object for Branchclass
        System.out.println("Enter the branch name you want to add :");
        String newbranch=sc.nextLine();
        branchArray.add(branch);
        System.out.println("New branch added . Branch name is "+ newbranch);
    }


//    addCustomerToBranch Method
    public void addCustomerToBranch(){
        System.out.println(" enter branch name to add new customer  ::");
        int branchnumber=sc.nextInt();
        branchnumber--;
        branchArray.get(branchnumber).addnewCustomer();
        branchnumber++;
        System.out.println("New customer add to branch "+ branchnumber+
                " Branch name is :: "+ branchArray.get(branchnumber).getName() );
        sc.nextLine();
    }


//    AddCustomerTransactions method
    public void AddCustomerTransactions(){
        System.out.println("Enter the name to which customer you want to add money :");
        String name=sc.nextLine();
        for (int i=0;i<branchArray.size();i++){
            if (branchArray.get(i).getName().equals(name)){
                System.out.println("Enter transaction amount ::");
                double amount=sc.nextDouble();
                amount+=branchArray.get(i).addTransaction();
                branchArray.get(i).setNewtransaction(amount);
                System.out.println("The amount "+ amount + " has been added to customer "+name + "account ");
                System.out.println("Total amount is :"+branchArray.get(i).getNewtransaction());
                break;
            }
        }
    }


//    printBranch Method
    public void printBranch(){
        for (int i=0;i<branchArray.size();i++){
            System.out.println(" Branch "+ (i+1) + " is :"+branchArray.getClass().getName());
            branchArray.get(i).printSummary();
        }
    }
}
