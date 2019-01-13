package com.temp.petstore;

public class App {

    public static void main(String... args) {
        System.out.println("Client has been started.");

        DTO dto = new DTO();
        dto.setFirstValue("First value in client");
        dto.setSecondValue("Second value in client");

        System.out.println(dto.toString());
    }
}
