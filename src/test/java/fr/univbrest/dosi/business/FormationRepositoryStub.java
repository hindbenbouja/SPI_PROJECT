package fr.univbrest.dosi.business;

import java.util.List;

import org.assertj.core.util.Lists;

import fr.univbrest.dosi.bean.Formation;
import fr.univbrest.dosi.repositories.FormationRepository;

public class FormationRepositoryStub implements FormationRepository {

	private List<Formation> donnees;
	
	FormationRepositoryStub() {
		donnees = Lists.newArrayList();
	}
	
	@Override
	public long count() {
		// TODO Auto-generated method stub
		return donnees.size();
	}


	@Override
	public void delete(Formation arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Iterable<? extends Formation> arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}


	@Override
	public Iterable<Formation> findAll() {
		// TODO Auto-generated method stub
		return donnees;
	}
	

	@Override
	public <S extends Formation> S save(S arg0) {
		// TODO Auto-generated method stub
		donnees.add(arg0);
		return arg0;
	}

	@Override
	public <S extends Formation> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Formation> findByCodeFormation(String codeFormation) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void delete(Long arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean exists(Long arg0) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Iterable<Formation> findAll(Iterable<Long> arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Formation findOne(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
