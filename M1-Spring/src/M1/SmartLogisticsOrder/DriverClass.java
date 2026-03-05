package M1.SmartLogisticsOrder;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class DriverClass {
    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<>();

        orders.add(new Order(1, "Amit Sharma", "Delhi", 12500, "DELIVERED", "2024-01-10"));
        orders.add(new Order(2, "Neha Verma", "Mumbai", 8700, "IN_TRANSIT", "2024-01-15"));
        orders.add(new Order(3, "Rahul Singh", "Delhi", 5200, "CANCELLED", "2024-01-09"));
        orders.add(new Order(4, "Sneha Kapoor", "Kolkata", 20000, "DELIVERED", "2024-01-08"));
        orders.add(new Order(5, "Arjun Mehta", "Chennai", 15300, "DELIVERED", "2024-01-11"));
        orders.add(new Order(6, "Priya Shah", "Mumbai", 6800, "PENDING", "2024-01-18"));
        orders.add(new Order(7, "Karan Patel", "Delhi", 22500, "DELIVERED", "2024-01-07"));
        orders.add(new Order(8, "Zoya Khan", "Kolkata", 4900, "IN_TRANSIT", "2024-01-14"));
        orders.add(new Order(9, "Manish Gupta", "Chennai", 10600, "DELIVERED", "2024-01-12"));
        orders.add(new Order(10, "Riya Sen", "Mumbai", 3400, "CANCELLED", "2024-01-05"));

        //Filtering
        orders.stream()
                .filter(p->p.getStatus().equals("DELIVERED"))
                .forEach(System.out::println);
        System.out.println();
        orders.stream()
                .filter(p->p.getAmount()>10000)
                .forEach(System.out::println);
        System.out.println();
        orders.stream()
                .filter(p->p.getStatus()!="DELIVERED")
                .forEach(System.out::println);
        System.out.println();
        //Transform
        orders.stream()
                .map(Order::getCustomerName)
                .forEach(System.out::println);
        System.out.println();

        //Sorting
        orders.stream()
                .sorted(Comparator.comparing(Order::getAmount))
                .forEach(System.out::println);
        System.out.println();
        orders.stream()
                .sorted(Comparator.comparing(Order::getDate))
                .forEach(System.out::println);


        //GroupBy

        orders.stream()
                .collect(Collectors.groupingBy(Order::getStatus))
                .forEach(System.out::printf);

        System.out.println(orders.stream()
                .filter(o->o.getStatus().equals("DELIVERED"))
                .mapToDouble(Order::getAmount)
                .sum());


    }
}
