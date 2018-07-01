package lesson11.lesson11hw;

public class BookingComAPI implements API {
    Room[] rooms;

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
        int counter = 0;

        for (Room room : rooms) {
            if (room != null) {

                if (condition(price, room.getPrice(), persons, room.getPersons(),
                        city, room.getCityName(), hotel, room.getHotelName()))
                    counter++;
            }
        }


       /* for (Room room : rooms) {
            if ((((room.getPrice() > (price - 100)) &&
                    (room.getPrice() <= (price + 100)) &&
                    (room.getPersons() == persons) && (room.getCityName() == city)
                    && (room.getHotelName() == hotel))))
                counter++;
        }
        */

        Room[] availableRooms = new Room[counter];
        int k = 0;
        for (int i = 0; i < counter; i++) {
            if (rooms[i] != null) {

            if (condition(price, rooms[i].getPrice(), persons, rooms[i].getPersons(),
                    city, rooms[i].getCityName(), hotel, rooms[i].getHotelName())) {
                System.out.println("room in " + hotel + " is available from" + rooms[i].getDateAvailableFrom());
                availableRooms[k] = rooms[i];
                k++;
            }

        }
        }

            /*

            if ((((rooms[i].getPrice() > (price - 100)) &&
                    (rooms[i].getPrice() <= (price + 100)) &&
                    (rooms[i].getPersons() == persons) && (rooms[i].getCityName() == city)
                    && (rooms[i].getHotelName() == hotel)))) {
                System.out.println("room in " + hotel + " is available from" + rooms[i].getDateAvailableFrom());
                availableRooms[k] = rooms[i];
                k++;
            }
        } */
            return availableRooms;
        }


        @Override
        public Room[] getAll () {
            return rooms;
        }
    }

