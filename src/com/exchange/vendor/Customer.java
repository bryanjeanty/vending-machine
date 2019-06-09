package com.exchange.vendor;

import java.util.*;

public class Customer {
  private double spendingBalance;
  private double netWorth;
  private ArrayList<Integer> selections = new ArrayList<Integer>();
  private ArrayList<String> items = new ArrayList<String>();

  public Customer(double netWorth) {
    this.netWorth = netWorth;
  }

  public void setSpendingBalance(double spendingBalance) {
    this.spendingBalance = spendingBalance;
  }

  public double getSpendingBalance() {
    return spendingBalance;
  }

  public double getNetWorth() {
    return netWorth;
  }

  public void setSelection(int selection) {
    int index = selections.size();
    selections.add(index, selection);
  }

  public ArrayList<Integer> getSelections() {
    return selections;
  }

  public void setItem(String item) {
    int index = items.size();
    items.add(index, item);
  }

  public ArrayList<String> getItems() {
    return items;
  }

}