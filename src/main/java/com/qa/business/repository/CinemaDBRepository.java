package com.qa.business.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;

import java.util.Collection;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.apache.log4j.Logger;

import com.qa.persistence.domain.HelloWorld;
import com.qa.persistence.domain.Movie;
import com.qa.util.JSONUtil;

public class CinemaDBRepository implements ICinemaRepository {

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	public List<HelloWorld> getHelloWorlds(){
		TypedQuery<HelloWorld> query = manager.createQuery("SELECT h FROM HelloWorld h", HelloWorld.class);
		return query.getResultList();
	}

}
