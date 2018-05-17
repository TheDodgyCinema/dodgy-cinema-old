package com.qa.business.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.qa.business.repository.ICinemaRepository;
import com.qa.persistence.domain.HelloWorld;
import com.qa.business.repository.ICinemaRepository;

public class CinemaService implements ICinemaService {
	@Inject
	ICinemaRepository repo;

	public String sayHello() {
		String names = String.join(", ", getNames());
		return String.format("{\"message\": \"Hello my dodgy friends!\", \"friends\": \"%s\"}", names);
	}
	
	private List<String> getNames() {
		List<HelloWorld> helloWorlds = repo.getHelloWorlds();
		List<String> names = new ArrayList<String>();
		for (HelloWorld helloWorld : helloWorlds) {
			names.add(helloWorld.getName());
		}
	return names;
	}

}
