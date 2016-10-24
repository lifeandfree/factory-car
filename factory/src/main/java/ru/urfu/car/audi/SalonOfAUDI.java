package ru.urfu.car.audi;

import ru.urfu.car.factory.ISalon;

public class SalonOfAUDI implements ISalon {

    public String getName() {
        return "Салон для AUDI";
    }

    public String getView() {
        return "Обивка велюр";
    }

}
