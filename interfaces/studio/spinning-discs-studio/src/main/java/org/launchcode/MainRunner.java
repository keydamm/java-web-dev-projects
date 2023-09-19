package org.launchcode;

public class MainRunner {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.
        CD cd = new CD("Of Days Renewed...", 300, "CD", "Hardcore");
        DVD dvd = new DVD("Game of Thrones", 1000, "DVD", "Fantasy");

        cd.spinDisc();
        dvd.spinDisc();
        cd.writeData();
        dvd.writeData();
        cd.readData();
        dvd.readData();
    }
}