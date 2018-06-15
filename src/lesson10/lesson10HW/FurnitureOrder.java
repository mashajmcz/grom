package lesson10.lesson10HW;

import java.util.Date;

public class FurnitureOrder extends Order {
    private String furnitureCode;

    public FurnitureOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity,
                          int basePrice, Customer customerOwned, String furnitureCode) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.furnitureCode = furnitureCode;
    }


    @Override
    public void validateOrder() {
        if (getCustomerOwned() == null || getCustomerOwned().getName() == null ||
                getCustomerOwned().getName() == "Тест" ||
                getCustomerOwned().getGender() == null)
            return;

        if (((getShipFromCity().equals("Киев") || getShipFromCity().equals("Львов"))
                && (getBasePrice() >= 500)
                && (! getCustomerOwned().getName().equals("Тест")))) {

            System.out.println("Your order " + getItemName() + " is confirmed");
            setDateConfirmed(new Date());
        }
    }


    @Override
    public void calculatePrice() {
        if (getBasePrice() < 5000) setTotalPrice((getBasePrice() * 1.05));
        else setTotalPrice((getBasePrice() * 1.02));

    }
}
