package lesson9;

import java.util.Arrays;

public class UserRepository {
    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public String[] getUserNames() {
        String[] names = new String[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null)
                names[i] = users[i].getName();
        }
        return names;
    }

    public long[] getUserIds() {
        int counter = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                counter++;
            }
        }
        long[] ids = new long[counter];
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null)
                ids[i] = users[i].getId();
        }
        return ids;
    }

    public String getUserNameById(long id) {

        {
            for (int i = 0; i < users.length; i++) {
                if (users[i] != null) {
                    if (users[i].getId() == id) {
                        return users[i].getName();
                    }
                }

            }
            return null;
        }
    }

   /* public User[] getUserByName (String name) {
        User[] usersWithName;
        int counter = 0;
        for (User elem : users) {
            if (elem != null) {
                if (elem.getName().equals(name)) {
                    counter++;
                }
            }
        }
        usersWithName = new User[counter];
        int counter2 = 0;
        for (int i = 0; i <= counter; i++) {
            if (users[i].getName().equals(name)) {
                usersWithName[counter2] = users[i];
                counter2++;
                System.out.println(users[i].getId() + " added");
            }

        }
        return usersWithName;
    } */

    public User getUserByName(String name) {
        User usersWithName;

        for (User elem : users) {
            if (elem != null) {
                if (elem.getName().equals(name)) {
                    return elem;
                }
            }
        }

        return null;
    }

    public User getUserById(long id) {
        User userWithId;
        for (User elem : users) {
            if (elem != null) {
                if (elem.getId() == id) {
                    return elem;
                }
            }
        }

        return null;
    }

    public User getUserBySessionId(String sessionId) {
        User userWithId;
        for (User elem : users) {
            if (elem != null) {
                if (elem.getSessionId() == sessionId) {
                    return elem;
                }
            }
        }
        return null;
    }


   /* public static void main(String[] args) {

        User vasia = new User(1, "Vasya", "FirstSession");
        User vova = new User(2, "Vladimir", "First Session");
        //User anotherVasia = new User(3, "Vasya", "First Session");

        User[] users = new User[3];
        users[0] = vasia;
        users[1] = vova;
        //  users[2] = anotherVasia;

        UserRepository userRepository = new UserRepository(users);
        // System.out.println(userRepository.getUserNameById(1));
        // System.out.println(userRepository.getUserNameById(3));
        //  System.out.println(userRepository.getUserNameById(2));
        //   System.out.println(Arrays.toString(userRepository.getUserNames()));

        System.out.println((userRepository.getUserByName("Vov")));

    } */


}