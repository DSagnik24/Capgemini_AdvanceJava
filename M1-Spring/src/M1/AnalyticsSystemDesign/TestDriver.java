package M1.AnalyticsSystemDesign;

import java.util.Scanner;
import java.util.List;

public class TestDriver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AnalyticsStore store = new AnalyticsStore();
        System.out.print("Enter buffer size K: ");
        int K = sc.nextInt();
        sc.nextLine();

        Analytics analytics = new Analytics(store, K);

        System.out.println("Enter commands (type \"END\" to quit):");
        while (true) {
            String input = sc.nextLine().trim();
            if (input.equals("END")) break;

            String[] parts = input.split(" ");
            String cmd = parts[0];

            switch (cmd) {
                case "registerAction":
                    ActionEnum action = ActionEnum.valueOf(parts[1]);
                    analytics.RegisterAction(action);
                    break;

                case "getTotalNumberOfLoggedActions":
                    System.out.println(analytics.getTotalNumberofLoggedActions());
                    break;

                case "getMostFrequentlyUsedActions":
                    List<ActionEnum> top = analytics.getMostFrequentlyUsedActions();
                    System.out.println(top);
                    break;

                case "getNumberOfActionRegisteredButNotSenttoAnalyticsStore":
                    System.out.println(analytics.getNumberOfActionRegisteredButNotSenttoAnalyticsStore());
                    break;

                default:
                    System.out.println("Unknown command");
            }
        }

        sc.close();
    }
}
