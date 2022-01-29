package com.nx.chiragnx.repository;

import com.nx.chiragnx.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, String> {
}
