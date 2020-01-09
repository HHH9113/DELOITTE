package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumTest {
Sum sum= null;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	
	System.out.println("Before class");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	
	System.out.println("After Class");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each");
		sum= new Sum();
	}
	
	@Test
	void testaddnumbers()
	{
		assertNotEquals(100, sum.addnumber(80,20));
		
	}

	@AfterEach
	void tearDown() throws Exception {
	
	System.out.println("After Each");}

	
	
	

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
