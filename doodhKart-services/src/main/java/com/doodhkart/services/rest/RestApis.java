package com.doodhkart.services.rest;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.services.dto.ProductList;

@CrossOrigin(origins="*")
@RequestMapping("doodhKart/apis")
@RestController
public class RestApis {
	
	@GetMapping(path="listedItems",produces="application/json")
	public List<ProductList> getProducts(){
		return null;
		
	}

}
