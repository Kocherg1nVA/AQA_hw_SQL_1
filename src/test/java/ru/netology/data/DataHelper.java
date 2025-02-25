package ru.netology.data;

import com.github.javafaker.Faker;
import lombok.Value;

public class DataHelper {
    private static final Faker faker = new Faker();

    public DataHelper() {
    }

    public static String generateLogin() {
        return faker.name().username();
    }

    public static String generatePassword() {
        return faker.internet().password();
    }

    public static String generateId() {
        return faker.internet().uuid();
    }

    public static AuthInfo getAuthInfoForTestData() {
        return new AuthInfo("vasya", "qwerty123");
    }

    @Value
    public static class AuthInfo {
        String login;
        String password;
    }
}
