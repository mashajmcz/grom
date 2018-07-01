package lesson11.lesson11hw;

public class BookingComAPI implements API {
    private Room[] rooms;

    public BookingComAPI(Room[] rooms) {
        this.rooms = rooms;
    }


    private boolean condition (int myPrice, int roomPrice, int neededPersons,
                               int roomPersons, String neededCity, String roomCity, String neededHotel,
                               String roomHotel) {

        for (Room room : rooms) {
            if (room != null) {

            if ((((roomPrice > (myPrice - 100)) &&
                    (roomPrice <= (myPrice + 100)) &&
                    (roomPersons == neededPersons) && (roomCity == neededCity)
                    && (neededHotel == roomHotel)))) ;

            return true;

        }}
        return false;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {

        int highestPrice = price + 100;
        int lowestPrice;

        if ((price - 100) >= 0)
            lowestPrice = price - 100;
        else lowestPrice = 0;


        int counter = 0;
        for (Room room : rooms) {
            if (room != null) {
                if (room.getPrice() <= highestPrice && room.getPrice() >= lowestPrice) {
                    if (room.getPersons() == persons && room.getCityName() == city && room.getHotelName() == hotel)
                        counter++;
                }
            }
        }

        Room[] resultPrice = new Room[counter];

        int k = 0;
        for (Room room : rooms) {
            if (room != null) {
                if ((room.getPrice() <= highestPrice && room.getPrice() >= lowestPrice)
                    && (room.getPersons() == persons && room.getCityName() ==
                            city && room.getHotelName() == hotel))
                {
                        resultPrice[k] = room;
                        k++;
                    }
                }
            }

        return resultPrice;
    }


        @Override
        public Room[] getAll () {
            return rooms;
        }
    }

