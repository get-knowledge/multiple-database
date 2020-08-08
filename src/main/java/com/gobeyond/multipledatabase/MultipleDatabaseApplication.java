package com.gobeyond.multipledatabase;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gobeyond.multipledatabase.model.Admission;
import com.gobeyond.multipledatabase.model.Appointment;
import com.gobeyond.multipledatabase.repository.AdmissionRepository;
import com.gobeyond.multipledatabase.repository.AppointmentRepository;

@SpringBootApplication
public class MultipleDatabaseApplication implements CommandLineRunner{

	@Autowired
	private AdmissionRepository admissionRepository;

	@Autowired
	private AppointmentRepository appointmentRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MultipleDatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//Save data at first time 
		
		admissionRepository.saveAll(Stream.of(
				new Admission(101, "A man needing surgery"),
				new Admission(102, "Nursing mum and baby"))
				.collect(Collectors.toList()));
		
		//save data at first time
		appointmentRepository.saveAll(Stream.of(
				new Appointment(101, "Teh first appointment ever"),
				new Appointment(102, "Appointment with a Dentist"))
				.collect(Collectors.toList()));
		
	}

}
