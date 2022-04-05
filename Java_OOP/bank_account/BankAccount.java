
public class BankAccount {
    //CLASS ATTRIBUTES
    private double checkingBalance;
    private double savingsBalance;

    //CLASS MEMBERS(STATIC)
    private static int numOfAccounts;
    private static double totalBalance;

    //CONSTRUCTORS
    public BankAccount() {
        checkingBalance = 0.0;
        savingsBalance = 0.0;
        numOfAccounts++;
    }

    //GETTERS
    public String getCheckingBalance() {
        return String.format("Checking balance is: %.2f\n", checkingBalance);
    }

    public String getSavingsBalance() {
        return String.format("Savings balance is: %.2f\n", savingsBalance);
    }

    public static String getNumAccounts() {
        return String.format("There are %d accoounts.\n", numOfAccounts);
    }

    //OTHER METHODS
    public void depositChecking(double deposit){
        checkingBalance += deposit;
        totalBalance += deposit;
    }

    public void depositSavings(double deposit) {
        savingsBalance += deposit;
        totalBalance += deposit;
    }

    public void withdrawChecking(double amount) {
        if (checkingBalance >= amount){
            checkingBalance -= amount;
            totalBalance -= amount;
        }
        else {
            System.out.println("Insufficient Funds!!!\n");
        }
    }

    public void withdrawSavings(double amount) {
        if (savingsBalance >= amount){
            savingsBalance -= amount;
            totalBalance -= amount;
        }
        else {
            System.out.println("Insufficient Funds!!!\n");
        }
    }

    public String totalFunds() {
        double total = checkingBalance + savingsBalance;
        return String.format("Total balance is $%.2f", total);
    }

    public static double totalBalance() {
        return totalBalance;
    }

}