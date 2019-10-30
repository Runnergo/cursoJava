package com.springBootMedicaments;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/medicaments")
public class MedicamentController {

	@Autowired
	MedicamentService service;

	@RequestMapping(value="farmacia", method = RequestMethod.GET)
	public String showMedicaments(Model model) {

		model.addAttribute("medicamentos", service.findAll());

		return "medicaments/farmacia";
	}

	@RequestMapping("/newMedicament")
	public String newMedicament() {

		return "medicaments/newMedicament.html";
	}

	@RequestMapping("/insertMedicament")
	public String insertMedicament(Medicament medicament, Model model) {

		service.insertMedicament(medicament);
		model.addAttribute("medicamentos", service.findAll());

		return "medicaments/farmacia.html";
	}

	@RequestMapping(value="deleteMedicament", method = RequestMethod.GET)
	public String deleteMedicament(@RequestParam("medicamentId") String medicamentId, Model model) {

		service.deleteMedicament(medicamentId);
		model.addAttribute("medicamentos", service.findAll());
	
		return "redirect:farmacia";
	}
	
	@RequestMapping("/updateMedicament")
	public String updateMedicament(@RequestParam("medicamentId") String medicamentId, Model model) {
		
		model.addAttribute("medicamentos", service.findById(medicamentId));
		return "medicaments/editMedicament.html";
	}

}
