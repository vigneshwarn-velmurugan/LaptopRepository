package com.mstask.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mstask.entity.Laptop;

public interface LaptopRepository extends JpaRepository <Laptop,Integer> {
@Query(value="select * from laptop_table where brand like ?",nativeQuery=true)
public List<Laptop> getbrand(String a);
}
