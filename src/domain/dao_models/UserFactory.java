package domain.dao_models;

import utils.exception.Exception;

import java.util.Arrays;

public class UserFactory {
    public static User create(String login, String password) {
        if(validate(login, password)) {
            return new User(login, password);
        }
        throw new Exception("incorrect login or password");
    }

    public static User create(String name, String login, String password) {
        if(validate(name, login, password))
            return new User(name, login, password);
        throw new Exception("incorrect name, login or password");
    }

    private static boolean validate(String ... fields) {
       return Arrays.stream(fields).noneMatch(s -> s == null || s.isEmpty());
    }
}
