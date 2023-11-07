package BankingApplication;
       /* Branch:
        Need to be able to add a new customer and initial transaction amount.
        Also needs to add additional transactions for that customer/branch*/
import java.util.ArrayList;
import java.util.Scanner;

public class BranchClass {
    ArrayList<CustomerClass> customerArray=new ArrayList<CustomerClass>();
     private Scanner sc=new Scanner(System.in);
    private String name;
    private double newtransaction;
    private double totalamount;

    //Add new Customer
    public void addnewCustomer(){
        System.out.println("Enter new customer name ::");
        name=sc.nextLine();
        System.out.println("Add the intital first amount to account :: ");
        newtransaction=sc.nextDouble();
        CustomerClass customer=new CustomerClass(name,newtransaction);  // creating object for CustomerClass and passing arguments as parameters .
        System.out.println("Customer Details aree ....");
        System.out.println(" Customer name is :: "+customer.getCustomername());
        System.out.println("Customer Initial transaction is :: "+customer.getTransactions());
        customerArray.add(customer);
        sc.nextLine();
    }


    //Add amount to existing account
    public double addTransaction(){
        System.out.println("Enter the customer name to whom you want to add money ?");
        String name=sc.nextLine();
        for (int i=0;i<customerArray.size();i++){
            if (customerArray.get(i).getCustomername().equals(name)){
                System.out.println("Customer found ");
                int index=i;
                System.out.println("Enter the amount that you want to add to customer account ?");
                newtransaction=sc.nextDouble();
                totalamount=customerArray.get(index).getTransactions()+newtransaction;
                System.out.println("Transaction completed successfully ");
                System.out.println("Updated amount is : "+totalamount + "/- rs");
                break;
            } else if (customerArray.size()==0) {
                System.out.println("There are no customers in this branch");
            }
            else {
                System.out.println("Customer not found");
            }

        }
        return totalamount;
    }

//    Removing money from account
    public void removeMoney(){
        System.out.println("From which customer you want to deduct money ? ");
        String name=sc.nextLine();
        for (int j=0;j<customerArray.size();j++){
            if (customerArray.get(j).getCustomername().equals(name)){
                System.out.println(" Customer found");
                int index=j;
                System.out.println("Enter the amount that you want to deduct ?");
                double deductedamount=sc.nextDouble();
                double remainingAmount=customerArray.get(j).getTransactions()-deductedamount;
                System.out.println(" Transactions successfully completed ");
                System.out.println(" Remaining amount in your account is :: " +remainingAmount);
            } else if (customerArray.size()==0) {
                System.out.println("There are no customer in the branch");
            }else {
                System.out.println("Customer not found");
            }
        }
    }



    // Print summary of customer
    public void printSummary(){
        if (customerArray.size()==0){
            System.out.println("There are no customers ");
        }else {
            for (int i=0;i<customerArray.size();i++){
                System.out.println(" There are "+ customerArray.size() + " Customers in this branch");
                System.out.println(" Customer "+ i + " name is :" +
                        customerArray.get(i).getCustomername()
                        + " the balance in their account is :: "+
                        customerArray.get(i).getTransactions());
            }
        }
    }


    // setters and Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNewtransaction() {
        return newtransaction;
    }

    public void setNewtransaction(double newtransaction) {
        this.newtransaction = newtransaction;
    }
}
