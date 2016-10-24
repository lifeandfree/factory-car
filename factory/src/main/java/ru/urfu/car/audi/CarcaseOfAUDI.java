package ru.urfu.car.audi;

import ru.urfu.car.factory.ICarcase;

public class CarcaseOfAUDI implements ICarcase {

    public String getName() {
        return "Кузов AUDI";
    }

    public String getShape() {
        return "Форма кузова AUDI";
    }

}
