package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DonorController {
	@Autowired
	private DonorService donorService;
	
 
	@GetMapping("/donors")
	public List<Donor> getDonors() {
		return donorService.getDonors();
	}
	
	@CrossOrigin
	@PostMapping("/donors")
	public Donor addDonor(@RequestBody Donor donor) {
	return donorService.addDonor(donor);
	}
	
	@GetMapping("/donors/{id}")
	public Donor getDonorById(@PathVariable int id) {
		return donorService.getDonorById(id);
	}
	
	
	/*@GetMapping("/donors/search_in/{country}/{state}/{district}/{city}")
	public Donor retriveDonorsByFiltering(@PathVariable String country ,
	@PathVariable String state,@PathVariable String district,@PathVariable String city) {
	Donor donor= repository.findByFilter(country,state,district,city);  
		return donor;
	}*/
	
	@GetMapping("/donors/search/{bloodGroup}")
	public Donor getDonorBybloodGroup(@PathVariable String bloodGroup) {
		return donorService.getDonorBybloodGroup(bloodGroup);
	}
	@DeleteMapping("/donors/{id}")
	public void deleteMovie(@PathVariable int id) {
		donorService.deleteDonor(id);
	}
	@PutMapping("/donors/{id}")
    public void updateDonor(@PathVariable int id, @RequestBody Donor updatedDonor) {
        donorService.updateDonor(id, updatedDonor);
    }
}
