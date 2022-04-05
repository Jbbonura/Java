public class TestCoffeeKiosk {
    public static void main(String[] args){
        CoffeeKiosk appTest = new CoffeeKiosk();
        appTest.addMenuItems("drip coffee", 3.5);
        appTest.addMenuItems("cappuccino", 1.5);
        appTest.addMenuItems("latte", 4.0);
        appTest.addMenuItems("mocha", 4.5);
        appTest.newOrder();
    }
}