public class account{
String name;
int id;
double balance;
int pin;
    public account(String name, int id, double balance, int pin){
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.pin = pin;
        
    }

    public void transfer(account othAccount, double amount, int pin){
    if(this.pin != pin){
        System.err.println("Wrong pin.");
    } else{
    othAccount.balance += amount;
    this.balance -= amount;
    System.out.println("Transfer Success");
    System.out.println(amount);
    System.out.println(this.balance);
    System.out.println(othAccount.balance);
    }
    }

    public void deposit(double amount){
    this.balance += amount;
    System.out.println("Deposit success, new balance: " + "$" + this.balance);
    }

    public void withdraw(double amount){
    this.balance-= amount;
    System.out.println("Withdrawl success, new balance: " + "$" + this.balance);
    }

    public void changePin(int pin, int nPin){
        if(this.pin!= pin){
            System.err.println("Wrong pin.");
        } else{
            this.pin=nPin;
            System.out.println("Pin changed. New pin: " + this.pin);
        }
    }

}