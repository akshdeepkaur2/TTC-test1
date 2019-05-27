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
		String[]from1  = new String[] {"Leslie"};
		String[] to1 = new String[]{"Don Mills"};
		String[] z = new String[] {""};
		Double fare = z.calculateTotal(from1,to1);
		assertEquals(2.5, fare,0.0);
	}
	//R2
	@Test
	public void test2() {
		String[]from1  = new String[] {"Sheppard"};
		String[] to1 = new String[]{"Finch Station"};
		String[] z = new String[] {""};
		Double fare = z.calculateTotal(from1,to1);
		assertEquals(3.00, fare,0.0);
	}
	//R3
	
	@Test
	public void test3() {
		String[]from1  = new String[] {"Don Mills"};
		String[] to1 = new String[]{"Finch Station"};
		String[] z = new String[] {"calculate"};
		Double fare = z.calculateTotal(from1,to1);
		assertEquals(3.00, fare,0.0);

}
