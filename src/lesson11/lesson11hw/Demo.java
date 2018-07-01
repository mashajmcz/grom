package lesson11.lesson11hw;

import java.util.Date;
import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {


    Room room0 = new Room(1, 200, 1, new Date(), "Stars", "Liverpool");
    Room room1 = new Room(2, 250, 1, new Date(), "Hiltop", "Liverpool");
    Room room2 = new Room(3, 300, 2, new Date(), "Stars", "London");
    Room room3 = new Room(4, 400, 1, new Date(), "Matrix", "Lwiw");
    Room room4 = new Room(5, 400, 3, new Date(), "Hayatt", "Kyiv");
    Room room5 = new Room(6, 500, 4, new Date(), "Hayatt", "Kyiv");

    Room[] rooms = new Room[]{room0, room1, room2, room3, room4, room5};

    BookingComAPI bookingComAPI = new BookingComAPI(rooms);
    TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI(rooms);
    GoogleAPI googleAPI = new GoogleAPI(rooms);


        System.out.println(Arrays.toString(bookingComAPI.findRooms(300, 1, "Liverpool", "Stars")));
       // System.out.println(Arrays.toString(tripAdvisorAPI.findRooms(400, 2, "London", "Stars")));
        System.out.println(Arrays.toString(googleAPI.findRooms(500, 4, "Kyiv", "Hayatt")));
        System.out.println();



    API[] apis = new API[]{bookingComAPI, tripAdvisorAPI, googleAPI};
    Controller controller = new Controller(apis);


        System.out.println(Arrays.toString(controller.check(bookingComAPI, tripAdvisorAPI)));

}
}

