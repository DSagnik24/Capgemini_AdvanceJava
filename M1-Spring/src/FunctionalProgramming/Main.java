package FunctionalProgramming;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product>list = new ArrayList<>();
        list.add(new Product("Milk",800,"Dairy"));
        list.add(new Product("Butter",1200,"Dairy"));
        list.add(new Product("Tomato",1600,"Groceries"));
        list.add(new Product("Onion",800,"Groceries"));
        list.add(new Product("Paneer",2000,"Dairy"));

        LambdaFunction findMore = p->{
            if(p.getPrice()>1000){
                System.out.println(p);
            }
        };
        for(Product p:list){
            findMore.operation(p);
        }

    }
}
