package hellojava;

public class Shop {
    public static void main(String[] args) {


// Initialize inventory items
        InventoryItem item1 = new InventoryItem("Purse", 200.50);
        InventoryItem item2 = new InventoryItem("Wallet", 150.50);
        InventoryItem item3 = new InventoryItem("Earrings", 100.00);

        //Simulate some sales
        Sale sale1 = new Sale(item1, item1.price());
        Sale sale2 = new Sale(item2, item2.price());
        Sale sale3 = new Sale(item3, item3.price());

        System.out.println("Sales Transactions: ");

        System.out.println(sale1);
        System.out.println(sale2);
        System.out.println(sale3);
    }
}