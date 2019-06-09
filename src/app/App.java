package app;

import app.VendingMachineTest;;

public class App {
    public static void main(String[] args) {
        VendingMachineTest vendor = new VendingMachineTest();

        // print inventory test
        vendor.printInventory();

        // select item test
        System.out.println();
        System.out.println(vendor.selectItem(1));
        System.out.println(vendor.selectItem(2));
        System.out.println(vendor.selectItem(3));
        System.out.println(vendor.selectItem(4));

        // enter payment && view balance test
        System.out.println();
        vendor.enterPayment(1.00);
        vendor.enterPayment(3.80);
        vendor.enterPayment(0.55);
        System.out.println(vendor.viewBalance());

        // request item test
        System.out.println();
        System.out.println(vendor.requestItem());
        System.out.println(vendor.getChange());
        System.out.println(vendor.selectItem(3));
        System.out.println(vendor.requestItem());
    }
}