package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//this is a bean class we need to tell spring that this is a bean class
//to do this we use @Component annotation
//if we don't mention it we will get an error because we are using getBean() on Customers class
@Component
public class Customers {
	private int custid;
	private String custname;
	private String coursename;
	@Autowired
	//if we dont mention autowired annotation Customers class will not know about the existence of Technologies class
	private Technologies t;//t is a variable for Technologies class
	
	public Technologies getT() {
		return t;
	}
	public void setT(Technologies t) {
		this.t = t;
	}
	public int getCustid() {
		return custid;
	}
	public String getCustname() {
		return custname;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public void display() {
		System.out.println("Customers object returned");
		t.display1();
	}

}
