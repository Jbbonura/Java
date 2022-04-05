import java.util.ArrayList;
public class TestOrders {

    public static void main(String[] args) {

        // ITEM METHOD TESTS
        Item item1 = new Item("mocha", 2.0);
        Item item2 = new Item("latte", 2.5);
        Item item3 = new Item("drip coffee", 3.0);
        Item item4 = new Item("capuccino", 3.5);

        item1.setName("Mocha");
        item1.setPrice(1.5);

        System.out.println("----------ITEM TESTS----------");
        System.out.println(item1.getName());
        System.out.println(item1.getPrice());

        //ORDER METHOD TESTS\
        System.out.println("----------ORDER TESTS----------");
        Order order1 = new Order();
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");

        order1.setName("James");
        System.out.println(order1.getName());
        System.out.println(order2.getName());
        System.out.println(order3.getName());
        System.out.println(order4.getName());

        order2.setReadyStatus(true);
        order4.setReadyStatus(true);
        System.out.println(order1.getStatusMessage());
        System.out.println(order2.getStatusMessage());
        System.out.println(order3.getStatusMessage());
        System.out.println(order4.getStatusMessage());

        order3.addItem(item3);
        order4.addItem(item2);
        order4.addItem(item1);
        order1.display();
        order2.display();
        order3.display();
        order4.display();



        

        
        
        



    }
}