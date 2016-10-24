package ru.urfu.car.bmw;

import ru.urfu.car.factory.ICarcase;

public class CarcaseOfBMW implements ICarcase {

    public String getName() {
        return "Кузов БМВ";
    }

    public String getShape() {
        return "Форма кузова БМВ";
    }

}
