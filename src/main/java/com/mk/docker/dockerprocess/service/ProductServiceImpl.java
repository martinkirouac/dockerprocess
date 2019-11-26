package com.mk.docker.dockerprocess.service;

import com.mk.docker.dockerprocess.domain.Product;
import com.mk.docker.dockerprocess.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public Product findById(Long id) {
        Optional<Product> product = productRepository.findById(id);
        return product.get();
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

}
