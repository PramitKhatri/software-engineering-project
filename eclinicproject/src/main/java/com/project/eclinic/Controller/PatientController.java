package com.project.eclinic.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.eclinic.Repository.PatientRepository;
import com.project.eclinic.model.Patient;

@Controller
public class PatientController {
	
	@Autowired
	private PatientRepository patientinf;
	
	@GetMapping("/Appointment")
	public String ShowAppoinmentForm() {
		return "Appointment";
	}
	
	
	@PostMapping("/Patient")
	public String SavePatientinf(@ModelAttribute Patient PatientQ) {
		patientinf.save(PatientQ);
		return "Success";
	}
	
	
	@GetMapping("/delete")
	public String delete(@RequestParam Long id) {
		patientinf.deleteById(id);
		return "redirect:/PatientList";
	}
	@GetMapping("/edit")
	public String edit(@RequestParam Long id, Model model) {
		model.addAttribute("Pmodel",patientinf.getById(id));
		
		return "PatientEdit";
	}
	
	@PostMapping("/update")
	public String update(@ModelAttribute Patient PatientQ) {
		patientinf.save(PatientQ);
		return "redirect:/PatientList";
	}
}
