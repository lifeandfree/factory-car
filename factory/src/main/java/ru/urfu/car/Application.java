package ru.urfu.car;

import ru.urfu.car.audi.AUDI;
import ru.urfu.car.bmw.BMW;
import ru.urfu.car.factory.ICarFactory;

public class Application {
    public static void main(String[] args) {
        AUDI audi = new AUDI();
        showCar(audi);

        BMW bmw = new BMW();
        showCar(bmw);

    }

    public static void showCar(ICarFactory carFactory) {

        System.out.println("Создаем машину");

        System.out.println(carFactory.createCarcase().getName());

        System.out.println(carFactory.createSalon().getName());

        System.out.println("Двигатель мощностью: " + carFactory.createEngine().getPower());

        System.out.println("Коплектация определена. Машина создана.\n");

    }
}
