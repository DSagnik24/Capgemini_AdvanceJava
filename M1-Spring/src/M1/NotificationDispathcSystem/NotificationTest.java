package M1.NotificationDispathcSystem;

import java.util.List;
import java.util.Scanner;

public class NotificationTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        NotificationDispatcher dispatcher = new NotificationDispatcher();
        System.out.print("Enter batch size M: ");
        int M = sc.nextInt();
        sc.nextLine();

        NotificationManager manager = new NotificationManager(dispatcher, M);

        System.out.println("Enter commands (END to stop):");
        while (true) {
            String line = sc.nextLine();
            if (line.equals("END")) break;

            String[] parts = line.split(" ");

            switch (parts[0]) {
                case "notify":
                    NotificationType type = NotificationType.valueOf(parts[1]);
                    manager.recordNotification(type);
                    break;

                case "pending":
                    System.out.println(manager.pendingCount());
                    break;

                case "total":
                    System.out.println(manager.totalCount());
                    break;

                case "topTypes":
                    List<NotificationType> top = manager.mostFrequentTypes();
                    System.out.println(top);
                    break;

                default:
                    System.out.println("Unknown command");
            }
        }
        sc.close();
    }
}
