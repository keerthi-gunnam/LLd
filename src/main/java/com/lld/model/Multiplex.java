package com.lld.model;

import java.util.ArrayList;
import java.util.List;

public class Multiplex {
	private final String id;
	private String name;
	private String location;
	private List<Screen>screens;
	
	
	public Multiplex(String name,String location,List<Screen> screens) {
		this.id=IdGenerator.generateID();
		this.name=name;
		this.location=location;
		this.screens=new ArrayList();
	}
	public void addScreens(Screen screen) {
		screens.add(screen);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<Screen> getScreens() {
		return screens;
	}

	public String getId() {
		return id;
	}
	
}
