package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServicelmp;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {
    private CarServicelmp carServicelmp = new CarServicelmp();

    @GetMapping()
    public String prontCar(@RequestParam(value = "count", required = false) String count, ModelMap modelMap) {
        if (count == null) {
            modelMap.addAttribute("cars", carServicelmp.listCars());
        }else {
            if (Integer.parseInt(count)>0){
              modelMap.addAttribute("cars",carServicelmp.getCarsCount(Integer.parseInt(count)));
            }else {
                System.out.println("no parametr");
            }

        }
        return "cars";
    }
}
