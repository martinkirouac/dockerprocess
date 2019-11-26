package com.mk.docker.dockerprocess.service;

import com.mk.docker.dockerprocess.domain.Product;

public interface ProductService {

    Product findById(Long id);
    void save(Product product);
}
