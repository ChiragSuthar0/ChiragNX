package com.nx.chiragnx.repository;

import com.nx.chiragnx.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, String> {
}
