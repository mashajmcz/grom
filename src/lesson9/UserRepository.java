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

    public String[] getUserNames() {
        String[] names = new String[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null)
            names[i] = users[i].getName();
        }
        return names;
    }

    public long [] getUserIds() {
        long [] ids = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null)
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
