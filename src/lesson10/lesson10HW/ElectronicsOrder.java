package lesson10.lesson10HW;

import java.util.Date;

public class ElectronicsOrder extends Order{
    private int guaranteeMonths;

    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity,
                            String shipToCity, int basePrice, Customer customerOwned, int guaranteeMonths) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.guaranteeMonths = guaranteeMonths;
    }

    @Override
    public void validateOrder() {
        if (checkMinimalPrice(getBasePrice()) && checkCity(getShipFromCity()) &&
        checkCity(getShipToCity()) && checkGender(getCustomerOwned().getGender())) {
        System.out.println("Your order " + getItemName() + " is validated");
        setDateConfirmed(new Date());
        }
    }

    private boolean checkCity (String cityName) {
        String[] validateCities = {"Киев", "Одесса", "Днепр", "Харьков"};

        for (String elem : validateCities) {
            if (cityName.equals(elem))
                return true;
            //else return false;
        }
        return false;
    }

    private boolean checkGender (String gender) {
        if (gender.equals("female"))
            return true;
       return false;
    }

    private boolean checkMinimalPrice(double priceOfOrder){
        if ((priceOfOrder) >= 100) return true;
        return false;
    }

    @Override
    public void calculatePrice() {
        String city = getShipToCity();
        if (checkCity(city)) {
            int basePrice = getBasePrice();
            double commission;
            double discount = 0;

            if (city.equals("Киев") || city.equals("Одесса"))
                commission = (basePrice * 0.1);
            else commission = (basePrice * 0.15);

            if (basePrice > 1000)
                discount = (basePrice + commission)*0.05;
            setTotalPrice(basePrice + commission - discount);

        }


    }
}
