package ShoppingCartAndProduct;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product>items = new ArrayList<>();

    public void addProduct(Product p){
        items.add(p);
    }
    public void removeProduct(Product p){
        if(items.remove(p)){
            System.out.println("Item removed");
        }else{
            System.out.println("Item not removed");
        }
    }
    public void displayCart(){
        System.out.println(items);
    }
}
