package lesson10.lesson10HW;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Order order1 = new ElectronicsOrder("snes mini", new Date(), "Киев",
                "Львов",2450, new Customer("Lin", "Львов", "female"),
                36);

        Order order2 = new ElectronicsOrder("PS4", new Date(), "Киев",
                "Херсон",800, new Customer("Riley", "Львов", "male"),
                12);


        Order order3 = new FurnitureOrder("snes mini", new Date(), "Киев",
                "Нижний Тагил",2450, new Customer("Lin", "Львов", "female"),
                "36");

        Order order4 = new FurnitureOrder("PS4", new Date(), "Киев",
                "Херсон",800, new Customer("Riley", "Львов", "male"),
                "12");

        order1.calculatePrice();
        order1.validateOrder();
        order1.confirmShipping();

        order2.calculatePrice();
        order2.validateOrder();
        order2.confirmShipping();

        order3.calculatePrice();
        order3.validateOrder();
        order3.confirmShipping();

        order4.calculatePrice();
        order4.validateOrder();
        order4.confirmShipping();




    }
}
