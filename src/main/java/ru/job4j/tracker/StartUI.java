package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    private Item intem = new Item();

    public static void main(String[] args) {
        StartUI startUI = new StartUI();
        startUI.outputDateAndTime();
    }

    void outputDateAndTime() {
        LocalDateTime currentDateTime = intem.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = currentDateTime.format(formatter);
        System.out.println(currentDateTimeFormat);
    }
}
