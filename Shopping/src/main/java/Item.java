public class Item {

    private int itemNumber = 0;
    private String itemName = null;
    private int quantity = 0;
    private double price = 0;

    //static block
    {
        itemNumber = 1;
        itemName = "Redbull";
        price = 2.49;
        setQuantity(2);
    }

    public Item(){
        super();
    }

    public Item(int itemNumber, String itemName, int quantity, double price){
        this.itemNumber = itemNumber;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    public int getItemNumber(){
        return itemNumber;
    }

    public void setItemNumber(int itemNumber){
        this.itemNumber = itemNumber;
    }

    public String getItemName(){
        return getItemName();
    }

    public void setItemName(String itemName){
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.itemName);
        return sb.toString();
    }

    public static void demo(){
        System.out.println("------------ Item.demo() ------------");
        Item obj = new Item();
        Item item1 = new Item(1, "Starbucks Caramel", 2, 5.50);
        Item item2 = new Item(2, "GongCha Brown Sugar milk tea", 2, 6.07);
        System.out.println("\n" + obj.toString() + "\n" + item1.toString() + "\n" + item2.toString() + "\n" + Item.class.getName() + ".demo()...done!");
    }
}
