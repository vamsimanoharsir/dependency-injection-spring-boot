package com.example.demo;

import org.springframework.stereotype.Component;

@Component
//this annotation is necessary to be identified as a spring component
public class Technologies {
	private int id;
	private String techname;
	public int getId() {
		return id;
	}
	public String getTechname() {
		return techname;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setTechname(String techname) {
		this.techname = techname;
	}
	public void display1() {
		System.out.print("technologies class object returned");
	}

	
}
