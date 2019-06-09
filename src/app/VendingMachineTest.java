package app;

public class VendingMachineTest {
  // customer state
  private double customer_balance;
  private int customer_selection = 0;

  // vending machine state
  private String vending_machine_items[] = new String[] { "coke", "pepsi", "water", "sprite" };
  private double vending_machine_item_prices[] = new double[] { 1.25, 1.25, 0.75, 1.00 };

  // methods
  public void printInventory() {
    System.out.println("Choose an item from the list below");
    System.out.println();
    for (int item = 0; item < vending_machine_items.length; item++) {
      System.out.println((item + 1) + ": " + vending_machine_items[item]);
    }
  }

  public String selectItem(int item_num) {
    if ((item_num > 0) && (item_num < vending_machine_items.length + 1)) {
      customer_selection = item_num;
      String item = vending_machine_items[customer_selection - 1];
      return "You have selected " + item;
    } else {
      return "Please enter a valid selection!";
    }
  }

  public void enterPayment(double payment) {
    customer_balance += payment;
  }

  public String viewBalance() {
    return "Your balance is $" + String.format("%.2f", customer_balance);
  }

  public String requestItem() {
    if ((customer_selection > 0) && (customer_selection < vending_machine_items.length + 1)) {
      if (customer_balance >= vending_machine_item_prices[customer_selection - 1]) {
        customer_balance -= vending_machine_item_prices[customer_selection - 1];
        return "Enjoy your " + vending_machine_items[customer_selection - 1] + "!";
      } else {
        return "Your balance is too low to pay for this item";
      }
    } else {
      return "Please make a valid selection before requesting an item";
    }
  }

  public double getChange() {
    double remaining_balance = customer_balance;
    customer_balance = 0;
    return remaining_balance;
  }
}