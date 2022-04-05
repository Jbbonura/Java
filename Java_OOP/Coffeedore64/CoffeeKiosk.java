import java.util.ArrayList;
public class CoffeeKiosk{
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    public CoffeeKiosk() {
        menu = new ArrayList<Item>();
        orders = new ArrayList<Order>();
    }

    public void addMenuItems(String name, double price){
        Item newItem = new Item(name, price);
        newItem.setIndex(menu.size());
        menu.add(newItem);
    }

    public void displayMenu() {
        for (Item item : menu) {
            System.out.printf("%d %s -- $%.2f\n", item.getIndex(), item.getName(), item.getPrice());
        }
    }

    public void newOrder() {
        System.out.println("Please enter a customer name for new order: ");
        String nameParam = "";
        nameParam = System.console().readLine();

        Order order = new Order(nameParam);

        displayMenu();
        System.out.println("Please enter a menu item index or q to quit: ");
        String itemNumber = System.console().readLine();

        while(!itemNumber.equals("q")) {
            Item newItem = menu.get(Integer.parseInt(itemNumber));
            order.addItem(newItem);
            System.out.println("Please enter a menu item index or q to quit: ");
            itemNumber = System.console().readLine();
        }
        order.display();
    }
}