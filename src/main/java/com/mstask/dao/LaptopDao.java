package com.mstask.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mstask.entity.Laptop;
import com.mstask.repository.LaptopRepository;

@Repository
public class LaptopDao {
@Autowired
LaptopRepository lr;
public String postThis(List<Laptop> l) {
	lr.saveAll(l);
	return "POSTED ALL SUCCESSFULLY";
}
public List<Laptop> getbrand(String a) {
	return lr.getbrand(a);
}
}
