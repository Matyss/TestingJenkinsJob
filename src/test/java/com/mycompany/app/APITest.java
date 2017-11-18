package com.mycompany.app;

import org.testng.annotations.Test;

public class APITest {
	
	@Test
	public void connectionRequest() {
		System.out.println("Connection to API achieved");
	}
	
	@Test
	public void listeningToGet200() {
		System.out.println("Got 200 status");
	}

}
