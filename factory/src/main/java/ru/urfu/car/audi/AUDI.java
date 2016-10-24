package ru.urfu.car.audi;

import ru.urfu.car.factory.ICarFactory;
import ru.urfu.car.factory.ICarcase;
import ru.urfu.car.factory.IEngine;
import ru.urfu.car.factory.ISalon;

public class AUDI implements ICarFactory {

    public ICarcase createCarcase() {
        return new CarcaseOfAUDI();
    }

    public IEngine createEngine() {
        return new EngineOfAUDI();
    }

    public ISalon createSalon() {
        return new SalonOfAUDI();
    }

}
