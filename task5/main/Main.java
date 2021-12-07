package com.epam.hw.task5.main;

import com.epam.hw.task5.entity.Book;
import com.epam.hw.task5.entity.CrismasTree;
import com.epam.hw.task5.entity.FlowerPot;
import com.epam.hw.task5.entity.Fridge;
import com.epam.hw.task5.logic.Basket;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.getGoods().add(new Book(100, 1, "Title", "Author"));
        basket.getGoods().add(new Book(100, 2, "Title1", "Author2"));
        basket.getGoods().add(new CrismasTree(500, 1, 3));
        basket.getGoods().add(new CrismasTree(200, 2, 2));
        basket.getGoods().add(new FlowerPot(50, 1, "Red", 3.5));
        basket.getGoods().add(new Fridge(1000, 1, "LG"));

      basket.check();

//      basket.checkFullData();

    }
}
