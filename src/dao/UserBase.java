package dao;

import domain.dao_models.User;

import java.util.ArrayList;
import java.util.List;

public class UserBase {
    private List<User> users;
    private static UserBase instance;

    private UserBase (){}

    private UserBase(List<User> users) {
        this.users = users;
        users.add(new User("j", "123"));
    }

    public static UserBase getInstance() {
        if (instance == null) {
            instance = new UserBase(new ArrayList<>()/*Arrays.asList())*/);
        }
        return instance;
    }

    public void addUser (User user) {
        users.add(user);
    }

    public boolean findUser(User user) {
        return users.contains(user);
    }
    public User getUser() {
        return users.get(0);
    }
}
