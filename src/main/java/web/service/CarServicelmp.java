package web.service;

import web.dao.CarDaolmp;
import web.model.Car;

import java.util.List;

public class CarServicelmp  implements CarService{
   private CarDaolmp carDaolmp = new CarDaolmp();
    @Override
    public List<Car> listCars() {
        return carDaolmp.listCars();
    }
}
