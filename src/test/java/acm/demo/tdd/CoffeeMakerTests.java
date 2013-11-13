package acm.demo.tdd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CoffeeMakerTests {

	
	CoffeeMaker maker;
	@Before
	public void setUp() {
		maker = 
	}
	
	@Test
	public void itMakesCoffee() {
		//given
		CoffeeMaker myCoffeeMaker = new CoffeeMaker();
		
		//when
		Coffee myCoffee = myCoffeeMaker.make("hot");
		
		
		//then
		assertTrue(myCoffee.isReady());
		assertEquals("yummy, hot coffee", myCoffee.descritption());
	
	}
	
	
	@Test
	public void itMakesColdCoffee() {
		//given
		CoffeeMaker myCoffeeMaker = new CoffeeMaker();
		
		//when
		Coffee myColdCoffee = myCoffeeMaker.make("cold");
		
		//then
		assertTrue(myColdCoffee.isReady());
		assertEquals("yummy, cold coffee", myColdCoffee.descritption());
		
	}
	
	@Test
	public void itMakesFlavoredCoffee() {
		//given
		CoffeeMaker myCoffeeMaker = new CoffeeMaker();
		
		//when
		Coffee mocha = myCoffeeMaker.make("mocha");
		
		
		//then
		assertTrue(mocha.isReady());
		assertEquals("yummy, hot mocha coffee", mocha.descritption());
		
	}

}
