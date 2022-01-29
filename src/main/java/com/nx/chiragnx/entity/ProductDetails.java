package com.nx.chiragnx.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductDetails {
    @Id
    private Long itemId;
    private String itemName;
    private String availablePieces;
    private String price;
    private String shortDescription;
    private String fullDescription;
    private String category;
    private String brand;

    public ProductDetails() {
    }

    public ProductDetails(String itemName, String availablePieces, String price, String shortDescription, String fullDescription, String category, String brand) {
        this.itemName = itemName;
        this.availablePieces = availablePieces;
        this.price = price;
        this.shortDescription = shortDescription;
        this.fullDescription = fullDescription;
        this.category = category;
        this.brand = brand;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getAvailablePieces() {
        return availablePieces;
    }

    public void setAvailablePieces(String availablePieces) {
        this.availablePieces = availablePieces;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
