package com.springBootMedicaments;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicamentService {

	@Autowired
	MedicamentRepository repository;

	public Iterable<Medicament> findAll() {

		return repository.findAll();
	}

	public void insertMedicament(Medicament medicament) {

		repository.save(medicament);
	}

	public void deleteMedicament(String id) {

		Optional<Medicament> medicament = repository.findById(id);

		if (medicament.get().getStockQuantity() > 1) {
			medicament.get().setStockQuantity(medicament.get().getStockQuantity() - 1);
			repository.save(medicament.get());
		} else {
			repository.delete(medicament.get());
		}

	}

	public Medicament findById(String id) {

		Optional<Medicament> medicament = repository.findById(id);
		return medicament.get();
	}

}
