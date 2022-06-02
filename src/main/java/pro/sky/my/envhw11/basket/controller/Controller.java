package pro.sky.my.envhw11.basket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.my.envhw11.basket.service.BasketService;

@RestController
@RequestMapping("/store/order/")
public class Controller {

    private final BasketService basketService;

    public Controller(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public boolean add(@RequestParam(required = false, name = "id") int id) {
        return basketService.add(id);
    }

    @GetMapping("/get")
    public String get() {
        return basketService.get();
    }

}
