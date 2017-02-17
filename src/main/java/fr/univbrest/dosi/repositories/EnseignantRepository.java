package fr.univbrest.dosi.repositories;


import org.springframework.data.repository.CrudRepository;

import fr.univbrest.dosi.bean.Enseignant;

import java.util.List;

public interface EnseignantRepository extends CrudRepository<Enseignant, Long> {

    List<Enseignant> findByNoEnseignant(Long noEnseignant);


}
