package com.hcl.annobased;

import org.springframework.stereotype.Component;

@Component
public class Samosa implements Pepsi {
	public void drink() {
		System.out.println("Eating Samosa");
	}
}
