package M1.OrderProcessor;

import java.util.List;
import java.util.Scanner;

public class OrderTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        OrderHandler handler = new OrderHandler();

        System.out.print("Enter batch size P: ");
        int P = sc.nextInt();
        sc.nextLine();

        OrderProcessor processor = new OrderProcessor(handler, P);

        System.out.println("Enter commands (type END to quit):");

        while (true) {
            String input = sc.nextLine().trim();
            if (input.equals("END")) break;

            String[] parts = input.split(" ");

            switch (parts[0]) {
                case "placeOrder":
                    OrderType type = OrderType.valueOf(parts[1]);
                    processor.placeOrder(type);
                    break;

                case "pendingOrders":
                    System.out.println(processor.pendingCount());
                    break;

                case "totalOrders":
                    System.out.println(processor.totalOrders());
                    break;

                case "mostFrequent":
                    List<OrderType> top = processor.mostFrequentOrderTypes();
                    System.out.println(top);
                    break;

                default:
                    System.out.println("Invalid command");
            }
        }

        sc.close();
    }
}
