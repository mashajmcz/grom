package lesson11.lesson11hw;

public class TripAdvisorAPI implements API{

    Room[] rooms;

    public TripAdvisorAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    public Room[] getRooms() {
        return rooms;
    }


    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int max = persons + 1;

        int min;

        if ((persons - 1) >= 1)  min = persons - 1;
        else min = 1;

        int counter = 0;
        for (Room room : rooms) {
            if (room != null) {
                if ((room.getPersons() <= max && room.getPersons() >= min)&&
                        (room.getPrice() == price && room.getCityName() == city && room.getHotelName() == hotel))
                        counter++;
                }
            }


        Room[] resultPersons = new Room[counter];

        int k = 0;
        for (Room room : rooms) {
            if (room != null) {
                if ((room.getPersons() <= max && room.getPersons() >= min)
                        && (room.getPrice() == price && room.getCityName() == city && room.getHotelName() == hotel))
                {
                        resultPersons[k] = room;
                        k++;
                    }
                }
            }

        return resultPersons;
    }





    @Override
    public Room[] getAll() {
        return rooms;
    }
}
