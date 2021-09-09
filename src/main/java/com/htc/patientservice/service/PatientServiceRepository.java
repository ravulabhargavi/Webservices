package com.htc.patientservice.service;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.htc.patientservice.model.Patient;



public interface PatientServiceRepository extends PagingAndSortingRepository<Patient,Long> {
	List<Patient> findByPatientName(@Param("patientName") String patientName);

}
