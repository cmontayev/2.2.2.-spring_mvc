package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.CarServicelmp;

import java.util.List;

@Controller
public class CarController {
  private   CarServicelmp carServicelmp = new CarServicelmp();

    @GetMapping(value = "/cars")
    public String prontCar(ModelMap modelMap){
        modelMap.addAttribute("cars",carServicelmp.listCars());
        return "cars";
    }
}
