//Audrey Tabler 700718345
//This program contains a class template for a bank account and also contains subclasses for checkings & savings accounts
import java.util.Date;

class Account {
    private int id; //initialize variables
    private double balance;
    static double annualInterestRate;
    private Date dateCreated = new Date(); //set date to current date

    public Account(){ //no arg constructor
        id = 0;
        balance = 0;

    }

    public Account(int uid,double curBalance){ //arg constructor
        id = uid; //id = to whatever id it gets from test program
        balance = curBalance;

    }
    public int getId(){ return id;} //accesses id
    public void setId(int chId){ id = chId;} //mutates id

    public double getBalance(){ return balance;} //access balance
    public void setBalance(int chBal ){ balance = chBal;} //mutates balance

    public double AnnualInterestRate(){ return annualInterestRate;} //access interest rate
    public void setAnnualInterestRate(double rate ){ annualInterestRate = rate;} //mutates interest rate

    public Date getDateCreated(){ return dateCreated;} //returns date created
    public double getMonthlyInterestRate(){ return annualInterestRate/12;} //returns monthly interest rate
    public double getMonthlyInterest(){ return (annualInterestRate/12 * balance);} //returns how much interest is earned per month

    public void withdraw(double amt){balance = balance - amt;} //subtracts amount received from program from total
    public void deposit(double amt){balance = balance + amt;}

    public String toString(){return("User ID: " + getId() + " Current Balance: " + getBalance());} // toString method
}

// SavingsAccount subclass of Account
class Savings extends Account{
    private double overdraftAmt;
    public Savings(int id, double balance){ //arg constructor
        super(id,balance);
    }
    @Override
    public void withdraw(double amt) {
        if (getBalance() - amt >= 0)
            super.withdraw(amt);
        else
            System.out.println("Withdraw failed-- balance may not go below $0");
    }

    public String toString(){return("User ID: " + getId() + " Current Balance: " + getBalance());}
}

//CheckingAccount subclass of Account
class Checking extends Account{
    private double overdraft = 100.0; //initialize variable for overdraft amount
    public Checking(int id, double balance, double overdraft){
        super(id,balance);
        this.overdraft = overdraft;
    }


    @Override
    public void withdraw(double amt) {
        if (getBalance() - amt >= (-overdraft)){
            if (getBalance() - amt < 0)
                System.out.println("This action will overdraw your account");
            super.withdraw(amt);
            System.out.println("Successfully withdrew $" + amt );}

        else
            System.out.println("Withdraw failed-- you may not overdraft more than $100");
    }
    public String toString(){return("User ID: " + getId() + " Current Balance: " + getBalance());}


}