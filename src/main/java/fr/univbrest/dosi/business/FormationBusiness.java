package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.Formation;

public interface FormationBusiness {

	Formation AjouterFormation(Formation formation);
	void SupprimerFormation(Formation formation);
	List<Formation> AfficherFormation();
	List<Formation> findByCodeFormation(String codeformation);
	public Formation updateFormation(String codeFormation, Formation formation);
	
	
}
