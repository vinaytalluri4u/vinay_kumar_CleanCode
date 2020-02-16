package cleancode.interest.constructioncost;

import static org.junit.Assert.*;

import org.junit.Test;

import cleancode.interest.constructioncost.Simpleinterest;
import cleancode.interest.constructioncost.compoundinterest;

public class compoundinterestTest {

	@Test
	public void test() {
		Simpleinterest s=new Simpleinterest();
		assertEquals(Double.valueOf(200.0),s.calculate_simpleinterest(1000.0,5.0,4.0));
		compoundinterest c=new compoundinterest();
		assertEquals(Double.valueOf(216.65290240000013),c.calculate_compoundinterest(1000.0,5.0,4.0));
	}

}
