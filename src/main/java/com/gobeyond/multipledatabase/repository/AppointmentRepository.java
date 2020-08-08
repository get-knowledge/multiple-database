package com.gobeyond.multipledatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gobeyond.multipledatabase.model.Appointment;

//@Profile("appointments")
@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
}
