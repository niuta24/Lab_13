package com.example.task1;

public class Auth {
    public User login() {
        int n = 0;
        if (n > 0) {
            return new MyTwitterUser(new TwitterUser());
        } else {
            return new MyFacebookUser(new FacebookUser());
        }
    }

    public void processData(User user) {
        System.out.println(user.getEmail());
        System.out.println(user.getCountry());
        System.out.println(user.getActiveTime());
    }
}
