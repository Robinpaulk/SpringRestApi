package com.robin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.robin.entity.Address;
import com.robin.entity.Address;
import com.robin.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
	private AddressService addressService;
	
	@GetMapping
    public List<Address> getAddresss(){
        return addressService.getAllAddress();
    }
    @GetMapping("/{id}")
    public Address getAddress(@RequestParam int id){
        return addressService.getAddress(id);
    }
    @PostMapping
    public Address addAddress(@RequestBody Address Address){
        return addressService.addAddress(Address);
    }
    @PutMapping("/{id}")
    public Address addAddress(@RequestParam int id,@RequestBody Address Address){
        return addressService.updateAddress(id,Address);
    }
    @DeleteMapping("/{id}")
    public void deleteAddress(@RequestParam int id){
    	addressService.deleteAddress(id);
    }
}
