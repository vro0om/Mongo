package com.example.FirstProj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	private int id;
	private String name;
	private String wepon;

	@Autowired
	@Qualifier("amore")
	private Mate mate;
	public Alien() {
		System.out.println("ObjectCreated");
	}

	public String getWepon() {
		return wepon;
	}

	public void setWepon(String wepon) {
		this.wepon = wepon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void show() {
		System.out.println("Alien"+mate.toString());
		
	}

	public Mate getMate() {
		return mate;
	}

	public void setMate(Mate mate) {
		this.mate = mate;
	}

}
