package pro.sky.my.envhw11.basket.service.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.my.envhw11.basket.service.BasketService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@SessionScope
public class BasketServiceImpl implements BasketService {

    public List basket = new ArrayList();

    @Override
    public boolean add(int productId) {
        return basket.add(productId);
    }

    @Override
    public String get() {
        return basket.toString();
    }
}
