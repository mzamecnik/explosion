package com.avg.shoppingcart.controller;

import com.avg.shoppingcart.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CartController {

	private final String CART_KEY = "shoppingCart";

	CartService cartService;

	@Autowired
	public CartController(CartService cartService) {
		this.cartService = cartService;
	}

	@RequestMapping("/cart")
	public @ResponseBody ModelMap getCart() {
		return new ModelMap(CART_KEY, cartService.getShoppingCart());
	}

	@RequestMapping("/cart/item/add")
	public void addItem() {
		cartService.addItem();
	}

}
