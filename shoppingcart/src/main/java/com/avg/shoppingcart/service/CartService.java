
package com.avg.shoppingcart.service;

import com.avg.shoppingcart.vo.ShoppingCart;

public interface CartService {

	void addItem();

	ShoppingCart getShoppingCart();
	
}
