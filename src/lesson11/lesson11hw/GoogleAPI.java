package lesson11.lesson11hw;

public class GoogleAPI implements API {

    Room[] rooms;

    public GoogleAPI(Room[] rooms) {
        this.rooms = rooms;
    }



    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int counter = 0;
        for (Room room : rooms) {
            if (room != null) {
                if (room.getPrice() == price && room.getPersons() == persons &&
                        room.getCityName() == city && room.getHotelName() == hotel)
                    counter++;
            }
        }

        Room[] availableRoomsGoogle = new Room[counter];

        int k = 0;
        for (Room room : rooms) {
            if (room != null) {
                if (room.getPrice() == price && room.getPersons() == persons
                        && room.getCityName() == city && room.getHotelName() == hotel) {
                    availableRoomsGoogle[k] = room;
                    k++;
                }
            }
        }
        return availableRoomsGoogle;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
