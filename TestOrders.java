public class TestOrders {
  public static void main(String[] args) {
    Item item1 = new Item("drip coffee", 1.50);
    Item item2 = new Item("cappuccino", 3.50);
    Item item3 = new Item("iced coffee", 2.75);
    Item item4 = new Item("mocha", 3.60);

    Order order1 = new Order();
    Order order2 = new Order();

    Order order3 = new Order("Dominic"); 
    Order order4 = new Order("Nicole"); 
    Order order5 = new Order("Sadie"); 


  }
}
