package lesson11.lesson11hw;

public class BookingComAPI implements API {
    Room[] rooms;

    public BookingComAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int counter = 0;
        for (Room room : rooms) {
            if ((((room.getPrice() > (price - 100)) &&
                    (room.getPrice() <= (price + 100)) &&
                    (room.getPersons() == persons) && (room.getCityName() == city)
                    && (room.getHotelName() == hotel))))
                counter++;
        }
        Room[] availableRooms = new Room[counter];
        int k = 0;
        for (int i = 0; i < counter; i++) {
            if ((((rooms[i].getPrice() > (price - 100)) &&
                    (rooms[i].getPrice() <= (price + 100)) &&
                    (rooms[i].getPersons() == persons) && (rooms[i].getCityName() == city)
                    && (rooms[i].getHotelName() == hotel)))) {
                System.out.println("room in " + hotel + " is available from" + rooms[i].getDateAvailableFrom());
                availableRooms[k] = rooms[i];
                k++;
            }
        }
            return availableRooms;
        }


        @Override
        public Room[] getAll () {
            return rooms;
        }
    }

