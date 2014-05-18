package com.avg.shoppingcart.vo;

import java.io.Serializable;
import org.springframework.data.annotation.Id;

public class ShoppingCart implements Serializable {

    @Id private int id;
    private int items;

    public ShoppingCart() {
        items = 10;
    }

    public void addItem() {
        items += 1;
    }

    public int getItemsCount() {
        return items;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
