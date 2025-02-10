
package hospitalgui;


public class Medicine {
    private int id,sellingPrice,BuyingPrice,quantity;
    private String name,description;

    public Medicine() {
    this.id=0;
    this.sellingPrice=0;
    this.BuyingPrice=0;
    this.quantity=0;
    this.name="";
    this.description="";
    }

    public Medicine(int id, int sellingPrice, int BuyingPrice, int quantity, String name, String description) {
        this.id = id;
        this.sellingPrice = sellingPrice;
        this.BuyingPrice = BuyingPrice;
        this.quantity = quantity;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getBuyingPrice() {
        return BuyingPrice;
    }

    public void setBuyingPrice(int BuyingPrice) {
        this.BuyingPrice = BuyingPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Medicine{" + "id=" + id + ", sellingPrice=" + sellingPrice + ", BuyingPrice=" + BuyingPrice + ", quantity=" + quantity + ", name=" + name + ", description=" + description + '}';
    }
    
    
}
