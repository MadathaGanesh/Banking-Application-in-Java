package BankingApplication;

public class CustomerClass {
    private String customername;
    private double transactions;


//    Creating Constructor
    public CustomerClass(String customername, double transactions) {
        this.customername = customername;
        this.transactions = transactions;
    }

    // Setters and Getters
    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public double getTransactions() {
        return transactions;
    }

    public void setTransactions(double transactions) {
        this.transactions = transactions;
    }
}
