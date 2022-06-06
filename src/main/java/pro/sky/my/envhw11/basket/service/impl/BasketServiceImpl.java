package pro.sky.my.envhw11.basket.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.my.envhw11.basket.service.BasketService;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class BasketServiceImpl implements BasketService {

    public List basket = new ArrayList<>();

    @Override
    public boolean add(List<Integer> productId) {
        return basket.add(productId);
    }


    @Override
    public String get() {
        return basket.toString();
    }
}
