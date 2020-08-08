package com.gobeyond.multipledatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gobeyond.multipledatabase.model.Admission;

@Repository
//@Profile("admissions")
public interface AdmissionRepository extends JpaRepository<Admission, Integer> {


}
