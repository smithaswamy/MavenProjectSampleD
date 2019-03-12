package com.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.demo.HelloWorld;

public class TestHello {
	
	HelloWorld hw=null;

	@Before
	public void testBefore() {
		hw=new HelloWorld();
				
	}

	@Test
	public void testAdd() {
		//HelloWorld hw=new HelloWorld();
		int actual=hw.add(3,4);
		int expected=7;
		assertTrue(actual==expected);
		
	}

}
