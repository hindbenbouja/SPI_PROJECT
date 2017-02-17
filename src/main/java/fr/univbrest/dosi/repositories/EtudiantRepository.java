package fr.univbrest.dosi.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.univbrest.dosi.bean.Etudiant;

import java.util.List;

public interface EtudiantRepository extends CrudRepository<Etudiant, Long> {

    List<Etudiant> findByNoEtudiant(String noEtudiant);


}
