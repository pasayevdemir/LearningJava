public class Product {
    public Product(){
        System.out.println("");
    }

    //attributes and feilds
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String kod;
//Getter and Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getKod() {
        this.kod=this.name.substring(0,1)+this.id;
        return this.kod;
    }

}
