package com.nx.chiragnx.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cart {
    @Id
    private String userName;
    private Long productId;
    private Long quantity;

    public Cart() {
    }

    public Cart(String userName, Long productId, Long quantity) {
        this.userName = userName;
        this.productId = productId;
        this.quantity = quantity;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

