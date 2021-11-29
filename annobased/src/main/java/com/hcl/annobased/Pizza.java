package com.hcl.annobased;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pizza implements Pepsi {
	public void drink() {
		System.out.println("Eating Pizza");
	}
}
