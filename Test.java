package Pullup;

import static org.junit.jupiter.api.Assertions.*;
import junit.framework.*;
import no.hvl.dat159.*;

public class Test extends TestCase {
	
	protected Car car;
	protected MotorCycle mc = new MotorCycle();
	
	protected void setUp() {
		car = new car();
		mc = new MotorCycle();
	}
	
	public void testAdd() {
		int carResult = car.dobbeltAntallHjul();
		int mcResult = mc.dobbeltAntallHjul();
		
		assertTrue(carResult == 8);
		assertTrue(mcResult == 4);
	}

}
