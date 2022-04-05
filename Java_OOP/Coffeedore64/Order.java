import java.util.ArrayList;
    
// Here we're creating a new data type called Order
public class Order {
    
    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items; // defaults to null
    
    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order() {
        this.name = "guest";
        this.items = new ArrayList<Item>();
    }

    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }
    
    // ORDER METHODS
    
    	// Most of your code will go here, 
    	// so implement the getters and setters first!
    
    // GETTERS & SETTERS

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setReadyStatus(boolean ready) {
        this.ready = ready;
    }

    public boolean getReadyStatus() {
        return ready;
    }

    // public void setItemList(Item item) {
    //     this.items.add(item);
    // }

    public ArrayList getItemList() {
        return items;
    }

    // OTHER METHODS
    public void addItem(Item item) {
        this.items.add(item);
    }
    
    public String getStatusMessage() {
        if(getReadyStatus()){
            return "Your order is ready.";
        }
        else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }
    public double getOrderTotal() {
        double sum = 0.0;
        items = getItemList();
        for (Item item : items) {
            double price = item.getPrice();
            sum += price;
        }
        return sum;
    }

    public void display() {
        System.out.println("Customer Name: \n" + getName());
        ArrayList<Item> items = new ArrayList<Item>();
        items = getItemList();
        double total = getOrderTotal();
        for (Item item: items) {
            System.out.printf("%s - $%.2f\n", item.getName(), item.getPrice());
        }
        
        System.out.printf("Total: $%.2f\n", total);
    }
}

