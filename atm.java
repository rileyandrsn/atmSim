public class atm {
    
    public static void main(String[] args){
    account account1 = new account("John Doe", 123456789, 500.00, 1234 );
    account account2 = new account("Jane Doe", 987654321, 500.00, 4321 );

    account2.transfer(account1, 250.00, 4321);
    account1.withdraw(300.00);
    account2.deposit(500.00);
    account1.changePin(1234, 5678);
    }
}
