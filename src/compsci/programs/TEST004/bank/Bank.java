package compsci.programs.TEST004.bank;

import java.util.Scanner;
public class Bank{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Current balance: ");
        double bal = scanner.nextDouble();
        BankAccount account = new BankAccount(name, bal);
        
        String opt = "";
        
        while(opt != "x"){
            System.out.println("w, d, g");
            opt = scanner.next();
            
            System.out.println(opt);
            
            if(opt == "w"){
                System.out.print("Ammount to withdraw: ");
                double with = scanner.nextDouble();
                account.withdraw(with);
            }else if(opt == "d"){
                System.out.print("Ammount to deposit: ");
                double dep = scanner.nextDouble();
                account.deposit(dep);
            }else if(opt == "g"){
                double balance = account.getBalance();
                System.out.println("Balance: "+balance);
            }else{
            	System.out.println("Please only choose one of the following:");
            }
        }
        scanner.close();
    }
}