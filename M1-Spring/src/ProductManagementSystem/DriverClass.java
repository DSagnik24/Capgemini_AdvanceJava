package ProductManagementSystem;

import ProductManagementSystem.Product;

import java.util.ArrayList;

public class DriverClass {

    public static void main(String[] args) {
        ArrayList<Product>list = new ArrayList<>();
        list.add(new Product("Milk",800,"Dairy"));
        list.add(new Product("Butter",1200,"Dairy"));
        list.add(new Product("Tomato",1600,"Groceries"));
        list.add(new Product("Onion",800,"Groceries"));
        list.add(new Product("Paneer",2000,"Dairy"));

        Transformation toUpper = p ->
                new Product(
                        p.getName().toUpperCase(),
                        p.getPrice(),
                        p.getCategory()
                );

        list.forEach(p ->
                System.out.println(toUpper.operation(p))
        );
    }
}
