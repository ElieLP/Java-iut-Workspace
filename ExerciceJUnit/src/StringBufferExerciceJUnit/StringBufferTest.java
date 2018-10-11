package StringBufferExerciceJUnit;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringBufferTest {
	
	private StringBuffer stringbuffer;

	@Before
	public void setUp() throws Exception {
		this.stringbuffer = new StringBuffer("abcdefghij");
	}

	@After
	public void tearDown() throws Exception {
		this.stringbuffer = null;
	}

	@Test
	public void testCharAt0() {
		assertEquals('a', stringbuffer.charAt(0));
	}
	
	@Test
	public void testCharAt9() {
		assertEquals('j', stringbuffer.charAt(9));
	}
	
	@Test
	public void testCharAt5() {
		assertEquals('f', stringbuffer.charAt(5));
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testCharAtMinus1() {
		stringbuffer.setCharAt(-1, 'x');
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testCharAtWithCharIndex() {
		stringbuffer.setCharAt('a', 'x');
	}
	
	@Test
	public void testToString() {
		assertEquals("abcdefghij", stringbuffer.toString());
	}
	
	@Test
	public void testSetCharAt0() {
		stringbuffer.setCharAt(0, 'x');
		assertEquals("xbcdefghij", stringbuffer.toString());
	}
	
	@Test
	public void testSetCharAt5() {
		stringbuffer.setCharAt(5, 'x');
		assertEquals("abcdexghij", stringbuffer.toString());
	}
	
	@Test
	public void testSetCharAt9() {
		stringbuffer.setCharAt(9, 'x');
		assertEquals("abcdefghix", stringbuffer.toString());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testSetCharAtMinus1() {
		stringbuffer.setCharAt(-1, 'x');
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testSetCharAtCharIndex() {
		stringbuffer.setCharAt('a', 'x');
	}
	
	@Test
	public void testAppend() {
		stringbuffer.append("zzz");
		assertEquals("abcdefghijzzz", stringbuffer.toString());
	}
	
	@Test
	public void testAppendWithNullString() {
		String strNull = null;
		stringbuffer.append(strNull);
		assertEquals("abcdefghij"+ null, stringbuffer.toString());
	}

}
