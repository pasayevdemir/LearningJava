public class Main {

    public static void main(String[] args) {
        Product product=new Product();
        product.setId(1);
        product.setName("Laptop");
        product.setDescription("Asus Laptop");
        product.setPrice(1399.99);
        product.setStockAmount(3);
        System.out.println(product.getKod());

        ProductManager productManager =new ProductManager();
        productManager.Add(product);

        System.out.println(product.getName());
    }
}
