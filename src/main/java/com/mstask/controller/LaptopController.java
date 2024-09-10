package com.mstask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mstask.entity.Laptop;
import com.mstask.service.LaptopService;

@RestController
@RequestMapping(value="/Laptop")
public class LaptopController {
@Autowired
LaptopService ls;
@PostMapping(value="/postall")
public String postThis(@RequestBody List<Laptop> l) {
	return ls.postThis(l);
}
@GetMapping(value="/getbrand/{a}") 
public List<Laptop> getbrand(@PathVariable String a) throws Exception{
	return ls.getbrand(a);
}
}
