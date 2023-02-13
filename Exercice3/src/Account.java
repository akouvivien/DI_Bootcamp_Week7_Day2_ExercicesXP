import java.text.DecimalFormat;

public class Account {

    private int id;
    private Customer customer;
    private double balance = 0.0;

    public Account(int id, Customer customer, double balance) {
        super();
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        super();
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return this.id;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return this.customer.toString() + df.format(this.balance);
    }


    void getCustomerName(){
        this.customer.getName();     
    }
 
    public Account deposit(double amount) {
         this.balance += amount;
         return this;
        
    }
    
    public Account withdraw(double amount) {
        if (balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("amout withdraw \n exceeds the current balance!" );
        }
        return this;
        
    }
}