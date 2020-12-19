package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarDaolmp implements CarDao {
    private Car car;

    @Override
    public List<Car> listCars() {
        return Arrays.<Car>asList(new Car(1, "bmv", "333"),
                new Car(2, "mers", "140"),
                new Car(3, "lada", "13"),
                new Car(4, "mazda", "323"),
                new Car(5, "rr", "gt"));
    }

    @Override
    public List<Car> getCarsCount(int count) {
        final List<Car> carList = new ArrayList<>();
        try {
            if (count < 0 || count > listCars().size()) {
                throw new NullPointerException();
            }else {
                for (int i = 0; i < count; i++) {
                    carList.add(listCars().get(i));
                }
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }


        return carList;
    }
}
