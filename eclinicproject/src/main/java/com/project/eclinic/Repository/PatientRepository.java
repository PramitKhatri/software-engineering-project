package com.project.eclinic.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.eclinic.model.Patient;

public interface PatientRepository extends JpaRepository<Patient,Long>{

}
