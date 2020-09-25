package com.robin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.robin.entity.Address;
import com.robin.repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository addressRepo;
	
    public List<Address> getAllAddress(){
        return addressRepo.findAll();
    }
    
    public Address getAddress(int id){
        return addressRepo.findById(id).orElse(null);
    }
    public Address addAddress(Address address){
        return addressRepo.save(address);
    }
    
    
    public Address updateAddress(int id,Address address){
    	address.setId(id);
        return addressRepo.save(address);
    }
    public void deleteAddress(int id){
    	addressRepo.deleteById(id);
    }
}
