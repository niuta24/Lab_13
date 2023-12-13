package com.example.task2;

public class DataBase extends БазаДаних {
    public String getUserData() {
        return отриматиДаніКористувача();
    }

    public String getStatisticsData() {
        return отриматиСтатистичніДані();
    }
}
