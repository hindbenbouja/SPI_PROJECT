package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.Formation;
import fr.univbrest.dosi.business.FormationBusiness;

@RestController
@RequestMapping(value="/formation")
public class FormationController {
	

	private FormationBusiness service;

	@Autowired
	public FormationController(FormationBusiness service) {
		this.service = service;
	} 
	
	@RequestMapping(value = "/{codeFormation}",method=RequestMethod.GET)
	public List<Formation> findByCodeFormation(@PathVariable String codeFormation){
		return this.service.findByCodeFormation(codeFormation);
	}
	
	
	
	@RequestMapping(method=RequestMethod.GET)
	public  List<Formation> LesFormations(){
	return service.AfficherFormation();   
}

	@RequestMapping(value = "/ajouter", method = RequestMethod.POST)
	public Formation ajouterFormation(@RequestBody Formation ajouterFormation) {
		System.out.println(ajouterFormation);
		return this.service.AjouterFormation(ajouterFormation);
	}
	
	@RequestMapping(value="/supprimer/{codeFormation}")
	public void supprimerFormation(@PathVariable String codeFormation){
		List<Formation> f = this.service.findByCodeFormation(codeFormation);
		this.service.SupprimerFormation(f.get(0));
		
	}
	@RequestMapping(value = "/update/{codeFormation}", method = RequestMethod.PUT)
	public Formation updateFormation(
			@RequestBody Formation updatedFormation) {
		System.out.println(updatedFormation);
		return this.service.updateFormation(updatedFormation.getCodeFormation(),updatedFormation);
	}
	

	
	
	
	
}
