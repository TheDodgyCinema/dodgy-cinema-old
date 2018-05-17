package com.qa.business.repository;

import java.util.List;

import com.qa.persistence.domain.HelloWorld;

public interface ICinemaRepository {
	public List<HelloWorld> getHelloWorlds();
}
