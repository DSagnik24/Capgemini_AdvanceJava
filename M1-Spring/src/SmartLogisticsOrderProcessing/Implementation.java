package SmartLogisticsOrderProcessing;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Implementation {
    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<>();

        orders.add(new Order(1, "Amit Sharma", "Delhi", 12500, "DELIVERED",
                LocalDate.parse("2024-01-10")));

        orders.add(new Order(2, "Neha Verma", "Mumbai", 8700, "IN_TRANSIT",
                LocalDate.parse("2024-01-15")));

        orders.add(new Order(3, "Rahul Singh", "Delhi", 5200, "CANCELLED",
                LocalDate.parse("2024-01-09")));

        orders.add(new Order(4, "Sneha Kapoor", "Kolkata", 20000, "DELIVERED",
                LocalDate.parse("2024-01-08")));

        orders.add(new Order(5, "Arjun Mehta", "Chennai", 15300, "DELIVERED",
                LocalDate.parse("2024-01-11")));

        orders.add(new Order(6, "Priya Shah", "Mumbai", 6800, "PENDING",
                LocalDate.parse("2024-01-18")));

        orders.add(new Order(7, "Karan Patel", "Delhi", 22500, "DELIVERED",
                LocalDate.parse("2024-01-07")));

        orders.add(new Order(8, "Zoya Khan", "Kolkata", 4900, "IN_TRANSIT",
                LocalDate.parse("2024-01-14")));

        orders.add(new Order(9, "Manish Gupta", "Chennai", 10600, "DELIVERED",
                LocalDate.parse("2024-01-12")));

        orders.add(new Order(10, "Riya Sen", "Mumbai", 3400, "CANCELLED",
                LocalDate.parse("2024-01-05")));


        //Filtering
        System.out.println("Delivered orders: ");
        orders.stream()
                .filter(p->p.getStatus().equals("DELIVERED"))
                .map(Order::getOrderId)
                .forEach(id-> System.out.print(id+", "));

        System.out.println("High value orders");
        orders.stream()
                .filter(p->p.getOrderAmount()>10000)
                .map(Order::getOrderId)
                .forEach(id-> System.out.print(id+", "));


        System.out.println("Delayed orders: ");
        orders.stream()
                .filter(p->p.getStatus() != "DELIVERED")
                .map(Order::getOrderId)
                .forEach(id-> System.out.print(id+", "));


        //Mapping
        System.out.println("Customer names: ");
        orders.stream()
                .map(Order::getCustomerName)
                .forEach(name-> System.out.println(name));

        //Sorting
        System.out.println("Sorted by amount: ");
        orders.stream()
                .sorted(Comparator.comparing(Order::getOrderAmount))
                .map(Order::getOrderAmount)
                .forEach(System.out::println);

        System.out.println("Sorted by amount DESC: ");
        orders.stream()
                .sorted(Comparator.comparing(Order::getDate))
                .map(Order::getDate)
                .forEach(System.out::println);

        //Grouping
        System.out.println("Grouping: ");
        orders.stream()
                .collect(Collectors.groupingBy(Order::getStatus))
                .forEach((status,list)->
                        System.out.println(status+" "+list.size()));

        double totalRevenue =
                orders.stream()
                        .filter(o -> o.getStatus().equals("DELIVERED"))
                        .mapToDouble(Order::getOrderAmount)
                        .sum();

        System.out.println("Total Revenue (Delivered): ₹" + totalRevenue);

        Map<String,Double> revenueCity =
                orders.stream()
                        .filter(p->p.getStatus().equals("DELIVERED"))
                        .collect(Collectors.groupingBy(
                                Order::getDeliveryLocation,
                                Collectors.summingDouble(Order::getOrderAmount)
                        ));

        revenueCity.forEach((city,revenue)->
                System.out.println(city+" "+revenue));


        String higestRevenue =
                revenueCity.entrySet()
                        .stream()
                        .max(Map.Entry.comparingByValue())
                        .get()
                        .getKey();

        System.out.println(higestRevenue);
    }
}
