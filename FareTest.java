import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FareTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
//R1
	@Test
	public void test1() {
		String[]from  = new String[] {"Leslie"};
		String[] to = new String[]{"Don Mills"};
		Double fare = z.calculateTotal(from,to);
		assertEquals(2.5, fare,0.0);
	}

}
