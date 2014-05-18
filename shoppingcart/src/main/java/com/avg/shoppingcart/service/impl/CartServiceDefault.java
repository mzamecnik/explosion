package com.avg.shoppingcart.service.impl;

import com.avg.shoppingcart.service.CartService;
import com.avg.shoppingcart.vo.ShoppingCart;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mirek
 */
@Service
public class CartServiceDefault implements CartService {

    private ShoppingCart shoppingCart;

    @Override
    public void addItem() {
    }

    @Override
    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

}
