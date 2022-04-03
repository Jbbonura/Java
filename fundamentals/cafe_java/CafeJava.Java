public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables (add below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.5;
        double lattePrice = 3.0;
        double cappuccinoPrice = 2.0;

        // Customer name variables (add below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order completions (add below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;

        // APP INTERACTION SIMULATION (Add code below)
        System.out.println(generalGreeting + customer1 + pendingMessage);

        if (isReadyOrder4){
            System.out.println(customer4 + readyMessage + displayTotalMessage + cappuccinoPrice);
        }
        else {
            System.out.println(customer4 + pendingMessage);
        }

        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage + displayTotalMessage + (lattePrice * 2));
        }
        else {
            System.out.println(customer2 + pendingMessage);
        }

        System.out.println(displayTotalMessage + (lattePrice - dripCoffeePrice));

    }
}