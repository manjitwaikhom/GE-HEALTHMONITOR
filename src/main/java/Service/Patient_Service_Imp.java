package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import DAO.Patient_DAO;
import Model.Patient;

@Service
@Transactional
public class Patient_Service_Imp implements Patient_Service {
 
	@Autowired
	private Patient_DAO patientDao;
	
	@Override
	public boolean savePatient(Patient patient) {
		return patientDao.savePatient(patient);
	}

	@Override
	public List<Patient> getPatients() {
		return patientDao.getPatients();
	}

	@Override
	public boolean deletePatient(Patient patient) {
		return patientDao.deletePatient(patient);
	}

	@Override
	public List<Patient> getPatientByID(Patient patient) {
		return patientDao.getPatientByID(patient);
	}

	@Override
	public boolean updatePatient(Patient patient) {
		return patientDao.updatePatient(patient);
	}

}
