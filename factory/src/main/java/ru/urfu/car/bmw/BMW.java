package ru.urfu.car.bmw;

import ru.urfu.car.factory.ICarFactory;
import ru.urfu.car.factory.ICarcase;
import ru.urfu.car.factory.IEngine;
import ru.urfu.car.factory.ISalon;

public class BMW implements ICarFactory {

    public ICarcase createCarcase() {
        return new CarcaseOfBMW();
    }

    public IEngine createEngine() {
        return new EngineOfBMW();
    }

    public ISalon createSalon() {
        return new SalonBMW();
    }

}
