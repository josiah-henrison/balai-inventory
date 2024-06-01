package com.balai.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.balai.inventory.entity.Item;

public interface ItemRepo extends JpaRepository<Item, Integer> {
    // auto generate
}
