package M1.FunctionalProgram;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();

        list.add(new Product("Milk",800,"Dairy"));
        list.add(new Product("Butter",1200,"Dairy"));
        list.add(new Product("Tomato",1600,"Dairy"));
        list.add(new Product("Onion",800,"Dairy"));
        list.add(new Product("Paneer",2000,"Dairy"));

        LambdaOperation finding = p->{
            if(p.getPrice()>1000){
                System.out.println(p);
            }
        };

        for(Product p:list){
            finding.operation(p);
        }




    }
}
