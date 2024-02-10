package com.example.courseproject2;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
    public class ServiceStore {
        private StoreCart storeCart;

        public ServiceStore(StoreCart storeCart) {
            this.storeCart = storeCart;
        }
        public List<Integer> addProduct(List<Integer> productsId) {
            storeCart.addProduct(productsId);
            return productsId;
        }

        public List<Integer> getProductList() {
            return storeCart.getProducts().stream().toList();
        }
    }

