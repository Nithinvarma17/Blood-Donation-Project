package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DonorService {
	
	@Autowired
	private DonorRepository donorRepository;
	
	@Autowired
	DonorRepository repository;
	
	public  List<Donor> getDonors(){
		List<Donor> donor=new ArrayList<>();
		donorRepository.findAll().forEach(donor::add);
		return donor;
	}
	
	public Donor addDonor(Donor donor) {
		return donorRepository.save(donor);
	}
	public Donor updateDonor(int id,Donor updateDonor) {
		Donor donor=donorRepository.findById(id).orElse(null);
		if(donor!=null) {
			donor.setFullName(updateDonor.getFullName());
			donor.setBloodGroup(updateDonor.getBloodGroup());
			donor.setMobileNo(updateDonor.getMobileNo());
			donor.setCountry(updateDonor.getCountry());
			donor.setState(updateDonor.getState());
			donor.setDistrict(updateDonor.getDistrict());
			donor.setCity(updateDonor.getCity());
			donor.setEmailId(updateDonor.getEmailId());
			donor.setUserId(updateDonor.getUserId());
			donor.setPassword(updateDonor.getPassword());
		    donor.setReTypepassword(updateDonor.getReTypepassword());
			donor.setConfirm(updateDonor.getConfirm());
			
			return donorRepository.save(donor);
		}
		return null;
		
	}
	public void deleteDonor(int id) {
		donorRepository.deleteById(id);
	}
	public Donor getDonorById(int id) {
		return donorRepository.findById(id).orElse(null);
	}
	public Donor getDonorBybloodGroup(String bloodGroup) {
		return donorRepository.findBybloodGroup(bloodGroup);
	}
	/*public Donor findByFilter(String country,String state,String district,String city) {
		return donorRepository.findByFilter(country, state, district, city);
	}*/
}
