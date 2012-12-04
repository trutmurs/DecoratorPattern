package ch.zhaw.students.test;



import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ch.zhaw.students.AstonMartin;
import ch.zhaw.students.Automobile;
import ch.zhaw.students.BMWRoadstar;
import ch.zhaw.students.BulletProofWindows;
import ch.zhaw.students.MissileLauncher;

public class TestingBond {

	private Automobile automobile1;
	private Automobile automobile2;
	
	@Before
	public void init() {

		automobile1 = new MissileLauncher(new BMWRoadstar());
		automobile2 = new MissileLauncher(new BulletProofWindows(new AstonMartin()));
		
		
	}

	@Test
	public void testDescription() {
	 
		assertEquals("BMW Roadstar, missile launcher", automobile1.getDescription());
	}
	
	@Test
	public void testCost(){
		
		assertEquals(167000, automobile1.cost());
	}
	@After
	public void clear() {
		automobile1 = null;
		automobile2 = null;
	}

	
	
	
	
	

}
