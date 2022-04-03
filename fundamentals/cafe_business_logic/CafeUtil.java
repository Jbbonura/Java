import java.util.ArrayList;
// import java.util.NumberFormat;
public class CafeUtil {

    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for(int i = 1; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        double sum = 0.0;
        for(double price : prices){
            sum += price;
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for(int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%d %s\n", i, menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s!\n", userName);
        int line = customers.size();
        System.out.printf("There are %d people in front of you\n", line);
        customers.add(userName);
        for (String customer : customers) {
            System.out.printf("%s\n", customer);
        }
    }

    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.printf("%s\n", product);
        double total = price;
        for (int i = 1; i <= maxQuantity; i++) {
            if (i != 1) {
                total += price - .50;
            }
            System.out.printf("%d - $%.2f\n", i , total);
        }
    }
    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        if(menuItems.size() != prices.size()){
            return false;
        }
        for (int i = 0; i < menuItems.size(); i++){
            System.out.printf("%d %s -- $%.2f\n", i, menuItems.get(i), prices.get(i));
        }
        return true;
    }

    public void addCustomer() {
        ArrayList<String> customers = new ArrayList<String>();
        String userName = "";
        System.out.println("Please enter customer name (Enter q when finished):");
        while (!userName.equals("q")) {
            userName = System.console().readLine();
            customers.add(userName);
        }
        for (String customer : customers) {
            System.out.printf("%s\n", customer);
        }
    }
}