package com.example.courseproject2;

import io.micrometer.common.lang.NonNull;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
@Repository
@SessionScope
public class StoreCart {

    private final List<Integer> products;

    public StoreCart() {
        this.products = new ArrayList<>();
    }

    @NonNull
    public List<Integer> addProduct(List<Integer> id) {
        this.products.addAll(id);
        return this.products;
    }

    public List<Integer> getProducts() {
        return products;
    }
}
