package com.htc.patientservice.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.htc.patientservice.model.Patient;


@Repository
public interface PatientServiceRepository extends JpaRepository<Patient,Long> {


}
