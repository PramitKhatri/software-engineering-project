package com.project.eclinic.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.eclinic.Repository.PatientRepository;

public class PatientListController {
	
	@Autowired
	private PatientRepository patientinf;
	
	
	@GetMapping("/PatientList")
	public String ShowList(Model model) {
		model.addAttribute("plist", patientinf.findAll() );
		return "PatientList";
	}

}
