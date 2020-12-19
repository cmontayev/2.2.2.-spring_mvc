package web.dao;

import web.model.Car;

import java.util.Arrays;
import java.util.List;

public class CarDaolmp implements CarDao{
    private Car car;

    @Override
    public List<Car> listCars() {
        return Arrays.<Car>asList(new Car(1, "bmv", "333"),
                new Car(2, "mers", "140"), new Car(3, "lada", "13"));
    }
}
