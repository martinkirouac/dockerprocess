package com.mk.docker.dockerprocess.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @BeforeEach
    void setUp() {
        Product p = new Product();
        p.setName("Screwdriver");
        p.setDescription("Screwdriver super cool");
    }

    @Test
    void setId() {
        Product p = new Product();
        p.setName("Screwdriver");
        p.setDescription("Screwdriver super cool");
        assertEquals("Screwdriver", p.getName());
    }

    @Test
    void setName() {
        Product p = new Product();
        p.setName("Screwdriver");
        p.setDescription("Screwdriver super cool");
        assertEquals("Screwdriver", p.getName());
    }

    @Test
    void setDescription() {
    }

    @Test
    void getName() {
    }

    @Test
    void getDescription() {
    }
}