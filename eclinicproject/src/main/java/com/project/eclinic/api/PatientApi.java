package com.project.eclinic.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.eclinic.Repository.PatientRepository;
import com.project.eclinic.model.Patient;

@RestController
public class PatientApi {
	@Autowired
	private PatientRepository patientinf;
	
	@GetMapping("/api/emp/list")
	public List<Patient> getAllPatient() {
		return patientinf.findAll();
	}
	
	@PostMapping("/api/patient/add")
	public String addpatient(@RequestBody Patient plist) {
		patientinf.save(plist);
		return "success";
	}
	
	@DeleteMapping("/api/patient/delete/(id)")
	public String deletepatient(@PathVariable Long id) {
		patientinf.deleteById(id);
		return "delete success";
	}

}
