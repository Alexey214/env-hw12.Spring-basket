package pro.sky.my.envhw11.basket.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.my.envhw11.basket.service.BasketService;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class BasketServiceImpl implements BasketService {

    public List<Integer> basket = new ArrayList<>();

    @Override
    public boolean add(int productId) {
        return basket.add(productId);
    }

    @Override
    public String get() {
        return basket.toString();
    }
}
