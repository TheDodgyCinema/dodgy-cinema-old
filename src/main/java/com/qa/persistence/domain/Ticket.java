package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ticket {

	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	private Showing showing;
	
	@ManyToOne
	private Seat seat;
	
	public Ticket() {
		super();
	}
	
	public Ticket(Long id) {
		super();
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}


