package com.example.demo;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface DonorRepository extends CrudRepository<Donor,Integer> {

	Donor findBybloodGroup(String bloodGroup);

	//Donor findByFilter(String country, String state, String district, String city);

}
