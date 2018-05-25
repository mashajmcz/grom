package lesson9;

public class Demo {

    public static void main(String[] args) {

        User vasia = new User(1, "Vasya", "FirstSession");
        User vova = new User(2, "Vladimir", "First Session");

        User[] users = new User[2];
        users[0]= vasia;
        users[1] = vova;

    }

}
