package org.example.groupbackend.inventory.model;

import jakarta.persistence.*;

@Entity
@Table(name="inventory_items")
public class InventoryItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String id;

    String label;

    Integer quantity;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}