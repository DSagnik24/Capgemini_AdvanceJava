package ShoppingCartAndProduct;

import java.util.Objects;

public class Product {
    private int productId;
    private String productName;

    public Product(int productId, String productName){
        this.productId = productId;
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return productId +
                " "+productName +", ";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId && Objects.equals(productName, product.productName);
    }
}
