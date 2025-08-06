package com.najafsk.springboot.prac.prac_app.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyRestController {

    @Value("${custom.property.country}")
    String country;

    @Value("${custom.property.city}")
    String city;

//    Expose "/" that returns Hello World
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

//    Expose new route to show name of my favorite food
    @GetMapping("/favFood")
    public String getFavoriteFood() {
        return "Beef Biryani!!!!";
    }

//    Expose a new route to show daily fortune
    @GetMapping("dailyFortune")
    public String getDailyFortune() {
        return "Today is your lucky day!";
    }

    //Expose a new api to get Country and City dynamically from application properties
    @GetMapping("currLoc")
    public String getCurrentLocation() {
        return "My current location is: City - " + city + " and Country - " + country + ".";
    }
}
