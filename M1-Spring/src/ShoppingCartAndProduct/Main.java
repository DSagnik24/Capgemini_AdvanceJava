package ShoppingCartAndProduct;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(new Product(1,"Milk"));
        cart.addProduct(new Product(2,"Tea"));
        cart.addProduct(new Product(3,"Biscuit"));
        cart.addProduct(new Product(4,"Coffee"));
        cart.addProduct(new Product(5,"Choco"));

        cart.displayCart();

        cart.removeProduct(new Product(1,"Milk"));
        cart.displayCart();

        cart.removeProduct(new Product(3,"Honey"));

        cart.displayCart();
    }
}
