package com.mk.docker.dockerprocess.repository;

import com.mk.docker.dockerprocess.domain.Product;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends CrudRepository<Product, Long>
{
}
