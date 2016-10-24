package ru.urfu.car.factory;

public interface ICarFactory {

    ICarcase createCarcase();

    IEngine createEngine();

    ISalon createSalon();

}