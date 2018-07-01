package lesson11.lesson11hw;

public class TripAdvisorAPI implements API{

    Room[] rooms;

    public TripAdvisorAPI(Room[] rooms) {
    }

    public Room[] getRooms() {
        return rooms;
    }


    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int index = 0;
        int i = 0;

        for (Room room : rooms) {
            if (persons <= 0)
                return null;
            if (room == null || room.getPersons() <= 0) {
                continue;
            }
            int max = persons + 1;
            int min = persons - 1;
            if (room.getPrice() == price && room.getCityName().equals(city)
                    && room.getHotelName().equals(hotel)) {
                if (room.getPersons() >= min && room.getPersons() >= 1 && room.getPersons() <= max)
                    index++;
            }
        }
        Room[] properRooms = new Room[index];
        for (Room room : rooms) {
            if (persons <= 0)
                return null;
            if (room == null || room.getPersons() <= 0) {
                continue;
            }
            int highBorder = persons + 1;
            int lowBorder = persons - 1;
            if (room.getPrice() == price && room.getCityName().equals(city)
                    && room.getHotelName().equals(hotel)) {
                if (room.getPersons() >= lowBorder && room.getPersons() >= 1 && room.getPersons() <= highBorder)
                    i++;
                    properRooms[i] = room;
            }
        }
        return properRooms;
    }




    @Override
    public Room[] getAll() {
        return rooms;
    }
}
