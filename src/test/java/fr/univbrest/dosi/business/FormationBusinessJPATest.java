package fr.univbrest.dosi.business;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Test;

import fr.univbrest.dosi.bean.Formation;
import fr.univbrest.dosi.business.impl.FormationBusinessJPA;
import fr.univbrest.dosi.repositories.FormationRepository;


public class FormationBusinessJPATest {
   
    @Test
    public void doitAjouterUneFormation() {
    	FormationRepository entrepot = new FormationRepositoryStub();
    	FormationBusinessJPA formationBusiness = new FormationBusinessJPA(entrepot);
    	
    	Formation formation1 = new Formation("123456", new Date(), "M2DOSI", "M2IADO", new Date(), BigDecimal.valueOf(2), "Master");
    	
    	formationBusiness.AjouterFormation(formation1);
    	assertThat(entrepot.findAll()).hasSize(1);
    }

}