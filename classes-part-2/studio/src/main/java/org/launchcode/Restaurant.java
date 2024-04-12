package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {
    public static void main(String[] args) {

        MenuItem croissant = new MenuItem("Croissant", 3.50, "A giant, flaky croissant", "Pastries", false);
        MenuItem chocolateCroissant = new MenuItem("Chocolate Croissant", 4.00, "Your favorite croissant with a chocolate center", "Pastries", false);
        MenuItem raspberryMacaron = new MenuItem("Raspberry Macaron", 2.50, "French almond flour cookies with a raspberry jam filling", "Cookies", false);
        MenuItem madeleine = new MenuItem("Madeleine", 2.75, "A shell-shaped vanilla cookie", "Cookies", true);
        MenuItem coffee = new MenuItem("Coffee", 3.50, "House roast drip coffee", "Coffee", false);

        ArrayList<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(croissant);
        menuItems.add(chocolateCroissant);
        menuItems.add(raspberryMacaron);
        menuItems.add(madeleine);
        menuItems.add(coffee);



    }
}
