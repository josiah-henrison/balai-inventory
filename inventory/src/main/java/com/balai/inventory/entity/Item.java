package com.balai.inventory.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Item {
    @Id
    private int id;

    private String name;
    private String description;
    private int targetStock;
    private int stock;
}
