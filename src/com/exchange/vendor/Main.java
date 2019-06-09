package com.exchange.vendor;

import java.util.*;

public class Main {
  public static void main(String args[]) {
    // create scanner object
    Scanner scan = new Scanner(System.in);

    // create customer object by requesting a starting networth
    System.out.println("Please enter your current networth!");
    double netWorth = scan.nextDouble();
    Customer carl = new Customer(netWorth);

    // create vending machine object
    VendingMachine hal = new VendingMachine();

    // set spending balance for customer by requesting from user
    System.out.println("Please enter your spending balance!");
    double spendingBalance = scan.nextDouble();
    carl.setSpendingBalance(spendingBalance);
    carl.updateNetWorth(-spendingBalance);
    System.out.println();
    System.out.printf("Your Spending balance is: $ %.2f%n", carl.getSpendingBalance());
    System.out.printf("Your networth is: $ %.2f%n", carl.getNetWorth());

    // view current vending machine inventory
    System.out.println();
    System.out.println("Make a selection");
    for (int i = 0; i < hal.printInventory().length; i++) {
      System.out.println((i + 1) + ": " + hal.printInventory()[i]);
    }

    // have customer select items
    System.out.println("Enter your selection. Otherwise press 0 to stop!");
    int selection = scan.nextInt();
    while (selection != 0) {
      carl.setSelection(selection);
      selection = scan.nextInt();
    }

    // have customer view selected items
    System.out.println();
    System.out.println(carl.getSelections());

    // have customer enter payment
    System.out.println();
    hal.enterPayment(carl.getSpendingBalance());
    carl.setSpendingBalance(0.00);

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

    // close scanner
    scan.close();
  }
}