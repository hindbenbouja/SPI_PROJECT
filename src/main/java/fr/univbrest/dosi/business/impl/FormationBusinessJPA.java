package fr.univbrest.dosi.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.univbrest.dosi.bean.Formation;
import fr.univbrest.dosi.business.FormationBusiness;
import fr.univbrest.dosi.repositories.FormationRepository;



@Component
public class FormationBusinessJPA implements FormationBusiness {

	private FormationRepository formationRepo;

	@Autowired
	public FormationBusinessJPA(FormationRepository formationRepo) {
		this.formationRepo = formationRepo;
	}
	
	public List<Formation> findByCodeFormation(String codeFormation){
		return this.formationRepo.findByCodeFormation(codeFormation);
	}

	@Override
	public Formation AjouterFormation(Formation formation) {
		return formationRepo.save(formation);
	}

	@Override
	public void SupprimerFormation(Formation formation) {
		formationRepo.delete(formation);
	}

	@Override
	public List<Formation> AfficherFormation() {
		return (List<Formation>) formationRepo.findAll();
	}
	@Override
	public Formation updateFormation(String codeFormation, Formation formation) {
		return formationRepo.save(formation);
	}
	
	

}