package compsci.programs.lesson015.bank;

public class BankAccount{
    
    public double balance;
    public String name;
    
    public BankAccount(){
        balance=0;
    }
    
    public BankAccount(double b){
        balance=b;
    }
    
    public BankAccount(String n, double b){
        name = n;
        balance = b;
    }
    
    public double deposit(double d){
        return (balance += d);
    }
    
    public double withdraw(double w){
        return (balance -= w);
    }
    
    public double getBalance(){
        return balance;
    }
    
    public String getName(){
        return name;
    }
}
