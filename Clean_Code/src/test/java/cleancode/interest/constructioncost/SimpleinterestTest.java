package cleancode.interest.constructioncost;

import static org.junit.Assert.*;

import org.junit.Test;

import cleancode.interest.constructioncost.Simpleinterest;

public class SimpleinterestTest {

	@Test
	public void test() {
		Simpleinterest s=new Simpleinterest();
		assertEquals(Double.valueOf(200.0),s.calculate_simpleinterest(1000.0,5.0,4.0));
		
	}

}
