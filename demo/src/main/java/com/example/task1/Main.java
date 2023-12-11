package com.example.task1;

public class Main {
    public static void main(String[] args) {
        Auth auth = new Auth();
        User user = auth.login();
        auth.processData(user);
    }
}