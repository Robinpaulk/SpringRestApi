package com.robin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robin.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
