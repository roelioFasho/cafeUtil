import java.util.ArrayList;
import java.util.Scanner;
public class CafeUtil {
 public static void main(String[] args) {
    System.out.println(getStreakGoal());
    System.out.println(getOrderTotal(args));
    System.out.println(displayMenu(args));
    addCostumer(args);
}
public static String getStreakGoal() {
    System.out.println("How many weeks have you been buying?");
    Scanner scan = new Scanner(System.in);
    String numWeeks = scan.nextLine();
    int numOfWeeks = Integer.parseInt(numWeeks);
    int sum = 0;
    for(int i=0; i<=numOfWeeks; i++) {
        sum += i;
    }
    String streakMsg = "Purchases needed by end of week " + numOfWeeks + ": " + sum;
    return streakMsg;
    }
public static String getOrderTotal(String[] args) {
    double[] prices = {2.5, 1.3, 3.4, 1.9};
    double price = 0;
    double total = 0;
    for(int i=0; i <prices.length;i++) {
        price = prices[i];
        total += price;
    }
    String totalMsg = "Order total: " + total;
    return totalMsg;
}
public static String displayMenu(String[] args) {
    String[] myItems = {"coffee", "cappuccino", "biscuit", "tea"};
String displayMsg = "";

for (int i = 0; i < myItems.length; i++) {
    int index = i;
    String item = myItems[i];
    displayMsg += index + " " + item + "\n";
}

return displayMsg;
}
public static void addCostumer(String[] args) {
    System.out.println("Please enter your name: ");
    String userName = System.console().readLine();
    System.out.println("Hello, " + userName + "!");
    ArrayList<String> customers = new ArrayList<String>();
    customers.add("Karim");
    customers.add("Vini");
    customers.add("Luka");
    customers.add("Fede");
    System.out.println("There are " + customers.size() + " people ahead of you!");
    customers.add(userName);
    System.out.println(customers);
}
}
