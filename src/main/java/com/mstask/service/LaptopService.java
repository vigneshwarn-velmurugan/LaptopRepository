package com.mstask.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mstask.dao.LaptopDao;
import com.mstask.entity.Laptop;
import com.mstask.laptopException.BrandNotFoundException;

@Service
public class LaptopService {
@Autowired
LaptopDao ld;
public String postThis(List<Laptop> l) {
	return ld.postThis(l);
}
public List<Laptop> getbrand(String a) throws Exception{
	List<Laptop> brand=ld.getbrand(a);
	if(brand.isEmpty()) {
		throw new BrandNotFoundException("no brnad match the input");
	}
	else {
		return ld.getbrand(a);
	}
}
}
