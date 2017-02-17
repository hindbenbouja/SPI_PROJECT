package fr.univbrest.dosi.repositories;


import org.springframework.data.repository.CrudRepository;

import fr.univbrest.dosi.bean.Formation;

import java.util.List;

public interface FormationRepository extends CrudRepository<Formation, Long> {

    List<Formation> findByCodeFormation(String codeformation);
    void delete(Formation formation);


}
