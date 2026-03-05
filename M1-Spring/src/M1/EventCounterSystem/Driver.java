package M1.EventCounterSystem;

import java.util.List;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EventLogger logger = new EventLogger();
        System.out.print("Enter batch size N: ");
        int N = sc.nextInt();
        sc.nextLine();

        EventCounter counter = new EventCounter(logger, N);

        System.out.println("Enter commands (type END to exit):");
        while (true) {
            String line = sc.nextLine();
            if (line.equals("END")) break;

            String[] parts = line.split(" ");

            switch (parts[0]) {
                case "registerEvent":
                    EventType event = EventType.valueOf(parts[1]);
                    counter.registerEvent(event);
                    break;

                case "getPending":
                    System.out.println(counter.getPendingCount());
                    break;

                case "getTotal":
                    System.out.println(counter.getTotalCount());
                    break;

                case "getTopEvents":
                    System.out.println(counter.getTopEvents());
                    break;

                default:
                    System.out.println("Invalid command!");
            }
        }
        sc.close();
    }
}
