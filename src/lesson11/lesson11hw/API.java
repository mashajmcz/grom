package lesson11.lesson11hw;

public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);
    Room[] getAll();


}
