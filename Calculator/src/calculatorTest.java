import static org.junit.Assert.*;

import org.junit.Test;



public class calculatorTest {
    
	calculator c = new calculator();
	@Test
	public void addTest() {
		
		assertEquals(6,c.add(3,3));
	}

}
