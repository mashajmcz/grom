package lesson11.lesson11hw;

public class Controller {
    API[] apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }


    Room[] requestRooms(int price, int persons, String city, String hotel) {
      int counter = 0;

      for (API api: apis) {
          Room[] rooms = api.findRooms(price,persons,city,hotel);
          if((rooms) != null)
              counter = counter + rooms.length;
      }
      if (counter == 0) return null;

    Room[] allMyRooms = new Room[counter];

        int index = 0;

        for (API api : apis) {
            if ((api.findRooms(price, persons, city, hotel) != null)) {
                for (Room room : api.findRooms(price, persons, city, hotel)) {
                    allMyRooms[index] = room;
                    index++;
                }
            }
        }
        return allMyRooms;
    }



    Room[] check (API api1, API api2) {
        Room[] roomsFromFirstAPI = api1.getAll();
        Room[] roomsFromSecondAPI = api2.getAll();

        int duplicates = 0;

        for (int i = 0; i < roomsFromFirstAPI.length; i++) {
            for (int j = 0; j < roomsFromSecondAPI.length; j++) {
                if (roomsFromFirstAPI[i].getPersons() == roomsFromSecondAPI[j].getPersons() &&
                        roomsFromFirstAPI[i].getPrice() == roomsFromSecondAPI[j].getPrice() &&
                        roomsFromFirstAPI[i].getCityName() == roomsFromSecondAPI[j].getCityName() &&
                        roomsFromFirstAPI[i].getHotelName() == roomsFromSecondAPI[j].getHotelName()) {
                    duplicates++;
                }
            }
        }
        if (duplicates == 0) {
            return null;
        }

        Room[] checkRoom = new Room[duplicates];

        int counter = 0;

        for (int i = 0; i < roomsFromFirstAPI.length; i++) {
            for (int j = 0; j < roomsFromSecondAPI.length; j++) {
                if (roomsFromFirstAPI[i].getPersons() == roomsFromSecondAPI[j].getPersons()
                        && roomsFromFirstAPI[i].getPrice() == roomsFromSecondAPI[j].getPrice()
                        && roomsFromFirstAPI[i].getCityName() == roomsFromSecondAPI[j].getCityName()
                        && roomsFromFirstAPI[i].getHotelName() == roomsFromSecondAPI[j].getHotelName()) {
                    checkRoom[counter] = roomsFromFirstAPI[i];
                    counter++;
                }
            }
        }
        return checkRoom;
    }


}
