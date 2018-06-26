package lesson11.lesson11hw;

public class TripAdvisorAPI implements API{

    Room[] rooms;

    public TripAdvisorAPI(Room[] rooms) {
    }

    public Room[] getRooms() {
        return rooms;
    }


    private boolean condition (int myPrice, int roomPrice, int neededPersons,
                               int roomPersons, String neededCity, String roomCity, String neededHotel,
                               String roomHotel) {

        for (Room room : rooms) {
            if ((((roomPrice == myPrice) &&
                    (roomPersons >= neededPersons - 1) && (roomPersons <= neededPersons + 1)
                    && (roomCity == neededCity)
                    && (neededHotel == roomHotel)))) ;

            return true;

        }
        return false;
    }



    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] properRooms;
    int counter = 0;
        for (Room room : rooms){
            if (condition(price, room.getPrice(), persons, room.getPersons(),
                    city, room.getCityName(), hotel, room.getHotelName() ))
        counter++;
        }

        properRooms = new Room[counter];

                int k = 0;
        for (int i = 0; i <counter; i++) {
            if (condition(price, rooms[i].getPrice(), persons, rooms[i].getPersons(),
                    city, rooms[i].getCityName(), hotel, rooms[i].getHotelName())) {
                System.out.println("the proper room is in Hotel" + rooms[i].getHotelName());
                properRooms[k] = rooms[i];
                k++;

            }

        }


    return properRooms;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
