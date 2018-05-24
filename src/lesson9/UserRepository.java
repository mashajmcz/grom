package lesson9;

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

    public String[] getUserNames(User[] users) {
        String[] names = new String[users.length];
        for (int i = 0; i < users.length; i++) {
            names[i] = users[i].getName();
        }
        return names;
    }

    public long [] getUserId(User[] users) {
        long [] ids = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            ids[i] = users[i].getId();
        }
        return ids;
    }

    public String getUserNameById(long id) {
        if (users[(int) id] != null) {
            return users[(int) id].getName();
        } else return null;

    }


}
