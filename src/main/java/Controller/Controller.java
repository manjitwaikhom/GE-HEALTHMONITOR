package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.Patient;
import Service.Patient_Service;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")
public class Controller {
	
	@Autowired
	private Patient_Service patientService;
	
	@PostMapping("save-patient")
	public boolean savePatient(@RequestBody Patient patient) {
		 return patientService.savePatient(patient);
		
	}
	
	@GetMapping("patients-list")
	public List<Patient> allpatients() {
		 return patientService.getPatients();
	}
	
	
	@DeleteMapping("delete-patient/{patient_id}")
	public boolean deletePatient(@PathVariable("patient_id") int patient_id,Patient patient) {
		patient.setPatient_id(patient_id);
		return patientService.deletePatient(patient);
	}

	@GetMapping("patient/{patient_id}")
	public List<Patient> allpatientByID(@PathVariable("patient_id") int patient_id,Patient patient) {
		 patient.setPatient_id(patient_id);
		 return patientService.getPatientByID(patient);
		
	}
	
	@PostMapping("update-patient/{patient_id}")
	public boolean updatePatient(@RequestBody Patient patient,@PathVariable("patient_id") int patient_id) {
		patient.setPatient_id(patient_id);
		return patientService.updatePatient(patient);
	}
}
