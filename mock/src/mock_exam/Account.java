package mock_exam;

class Customer {
    private int customerid;
    private String customerName, emailid;
    public int getCustomerid() {
        return customerid;
    }
    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getEmailid() {
        return emailid;
    }
    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }
    
    Customer() {
        this.customerid = customerid;
        this.customerName = customerName;
        this.emailid = emailid;
    }
    
    }



abstract class Account1 {
    
    protected int accountNumber;
    protected Customer customerObj;
    protected double balance;
    
    Account1() {
        this.accountNumber = accountNumber;
        this.customerObj = customerObj;
        this.balance=balance;
        }
    
    abstract public boolean withdraw(double amount);
    
    
}



class SavingsAccount extends Account1 {
    private double minimumBalance;



   
    SavingsAccount () {
        this.accountNumber = accountNumber;
        this.customerObj = customerObj;
        this.balance = balance;
        this.minimumBalance = minimumBalance;
    }
    
    @Override
    public boolean withdraw(double amount) {
        if ( balance > minimumBalance)  {
            return true;}
        else {
            return false;
        }
        }
    
}



public class Account {



   public static void main(String[] args) {



       
    }



}

