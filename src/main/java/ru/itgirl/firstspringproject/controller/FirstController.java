package ru.itgirl.firstspringproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    enum Day {

        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;
    }

    DayOfWeekEnum days;

    @GetMapping("/dayOfWeek")
    public String dayOfWeek(@RequestParam(value = "name", defaultValue = "World") String name) {

        try {
            days = DayOfWeekEnum.valueOf(name);
        } catch (IllegalArgumentException e) {
            return String.format("Hello %s!", name);
        }

        switch (days) {
            case MONDAY:
                return "Сегодня Понедельник!";
            case TUESDAY:
                return "Сегодня Вторник!";
            case WEDNESDAY:
                return "Сегодня Среда!";
            case THURSDAY:
                return "Сегодня Четверг!";
            case FRIDAY:
                return "Сегодня Пятница!";
            case SATURDAY:
                return "Сегодня Суббота!";
            case SUNDAY:
                return "Сегодня Воскресенье!";
        }
        return name;
    }
}





