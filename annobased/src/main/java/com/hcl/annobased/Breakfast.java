package com.hcl.annobased;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Breakfast {

	@Autowired
	//@Qualifier("Samosa")
	Pepsi pepsi;

	public Pepsi getPepsi() {
		return pepsi;
	}

	public void setPepsi(Pepsi pepsi) {
		this.pepsi = pepsi;
	}
	
	public void eat()
	{
	System.out.println("Eating Breakfast");
	pepsi.drink();
	}
}
