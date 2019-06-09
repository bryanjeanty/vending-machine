package com.exchange.vendor;

import java.util.*;

public class VendingMachine {
  private double paymentBalance;
  private static String productList[] = new String[] { "coke", "pepsi", "water", "sprite" };
  private static Map<String, Double> productPrices = new HashMap<String, Double>();

  public VendingMachine(String args[]) {
    productPrices.put(productList[0], 1.25);
    productPrices.put(productList[1], 1.25);
    productPrices.put(productList[2], 0.75);
    productPrices.put(productList[3], 1.00);
  }

  public void setPaymentBalance(double paymentBalance) {
    this.paymentBalance = paymentBalance;
  }

  public double getPaymentBalance() {
    return paymentBalance;
  }

  public String[] printInventory() {
    return productList;
  }

  public String provideItem(int selection) {
    if ((selection > 0) && (selection <= productList.length)) {
      double productPrice = productPrices.get(productList[selection]);
      if (productPrice >= paymentBalance) {
        paymentBalance -= productPrice;
        return productList[selection];
      } else {
        return "Balance too low!";
      }
    } else {
      return "Item not found!";
    }
  }

  public double returnChange() {
    double change = paymentBalance;
    paymentBalance = 0.00;
    return change;
  }
}