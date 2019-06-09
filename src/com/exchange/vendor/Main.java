package com.exchange.vendor;

// import java.util.*;
// import com.exchange.vendor.*;

public class Main {
  public static void main(String args[]) {
    // create customer object
    Customer carl = new Customer(100.00);
    // create vending machine object
    VendingMachine hal = new VendingMachine();

    // set spending balance for customer
    carl.setSpendingBalance(5.00);
    carl.updateNetWorth(-5.00);
    System.out.printf("Your Spending balance is: $ %.2f%n", carl.getSpendingBalance()); // $5.00
    System.out.printf("Your networth is: $ %.2f%n", carl.getNetWorth()); // $95.00

    // view current vending machine inventory
    System.out.println();
    System.out.println("Make a selection");
    for (int i = 0; i < hal.printInventory().length; i++) {
      System.out.println((i + 1) + ": " + hal.printInventory()[i]);
    }

    // have customer select items
    carl.setSelection(1);
    carl.setSelection(3);

    // have customer view selected items
    System.out.println();
    System.out.println(carl.getSelections());

    // have customer enter payment
    hal.enterPayment(carl.getSpendingBalance());

    // have customer view payment balance
    System.out.println();
    System.out.printf("You entered: $ %.2f into the vending machine%n", hal.getPaymentBalance());

    // make vending selection and have vending machine return items
    for (int index = 0; index < carl.getSelections().size(); index++) {
      carl.setItem(hal.provideItem(carl.getSelections().get(index)));
    }

    // view customer item list
    System.out.println();
    System.out.println(carl.getItems());

    // return change to customer, and view their spending balance & networth
    carl.setSpendingBalance(hal.returnChange());
    System.out.println();
    System.out.printf("Your current spending balance is: $ %.2f%n", carl.getSpendingBalance());
    System.out.printf("Your current networth is: $ %.2f%n", carl.getNetWorth());
  }
}