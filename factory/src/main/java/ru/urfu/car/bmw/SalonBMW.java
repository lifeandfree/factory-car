package ru.urfu.car.bmw;

import ru.urfu.car.factory.ISalon;

public class SalonBMW implements ISalon {

    public String getName() {
        return "Салон для БМВ";
    }

    public String getView() {
        return "Обивка кожанная";
    }

}
