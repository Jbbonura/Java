
public class TestBankAccount {
    public static void main(String[] args){
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();

        account1.withdrawChecking(50);
        account1.depositChecking(100);
        account1.withdrawChecking(50.5);
        account1.depositSavings(25.5);
        System.out.println(account1.getCheckingBalance());
        System.out.println(account1.getSavingsBalance());
        System.out.println(account1.totalFunds());
        
        account2.depositChecking(200);
        account3.depositSavings(100);

        System.out.println(BankAccount.totalBalance());
    }
}