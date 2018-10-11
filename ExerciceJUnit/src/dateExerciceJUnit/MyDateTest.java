package dateExerciceJUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;

/**
 * @author graffion
 *
 */
public class MyDateTest extends TestCase {
	
	@Test
	public void testMyDateNextDayYearChange() {
		MyDate d = new MyDate(31, 12, 2006);
		d.nextDay();
        assertEquals(1, d.getDay());
        assertEquals(1, d.getMonth());
        assertEquals(2007, d.getYear());
	}
	
	@Test
	public void testMyDateNextDayMonthChange() {
		MyDate d = new MyDate(30, 11, 2006);
		d.nextDay();
        assertEquals(1, d.getDay());
        assertEquals(12, d.getMonth());
        assertEquals(2006, d.getYear());
	}
	
	@Test
	public void testMyDateNextDay() {
		MyDate d = new MyDate(15, 11, 2006);
		d.nextDay();
        assertEquals(16, d.getDay());
        assertEquals(11, d.getMonth());
        assertEquals(2006, d.getYear());
	}

	@Test
    public void testGetDay() {
        MyDate d = new MyDate(31, 12, 2006);
        assertEquals(31, d.getDay());
    }

	@Test
    public void testGetMonth() {
    	MyDate d = new MyDate(31, 12, 2006);
    	assertEquals(12, d.getMonth());
    }

	@Test
    public void testGetYear() {
    	MyDate d = new MyDate(31, 12, 2006);
    	assertEquals(2006, d.getYear());
    }

	@Test
    public void testCheckInvalidData() {
    	MyDate d = new MyDate(31, 2, 2006);
    	assertFalse(d.checkData());
    }
    
	@Test
    public void testCheckValidData() {
    	MyDate d = new MyDate(10, 12, 2006);
    	assertTrue(d.checkData());
    }
    
	@Test
    public void testSimpleValidDates() {
        boolean b = MyDate.isValidDate(1, 1, 2000);
        assertTrue(b);
        b = MyDate.isValidDate(25, 12, 2000);
        assertTrue(b);
    }

	@Test
    public void test0InvalidDate() {
        boolean b = MyDate.isValidDate(0, 1, 2000);
        assertFalse("0 est invalide pour le jour", b);
    }
    
	@Test
    public void test32InvalidDate() {
    	boolean b = MyDate.isValidDate(32, 12, 2000);
        assertFalse(b);
    }

	@Test
    public void testValidLimitDates() {
        boolean b = MyDate.isValidDate(31, 1, 2000);
        assertTrue("31 janvier est une date valide", b);
    }

	@Test
    public void testInvalidLimitDates() {
        boolean b = MyDate.isValidDate(31, 4, 2000);
        assertFalse("31 avril est une date invalide", b);
    }

	@Test
    public void testFebruaryValidLimitDates() {
        boolean b = MyDate.isValidDate(29, 2, 2000);
        assertTrue("29 février 2000 est une date valide", b);
    }

	@Test
    public void testFebruaryInvalidLimitDates() {
        boolean b = MyDate.isValidDate(29, 2, 2001);
        assertFalse("29 février 2001 est une date invalide", b);
    }

}


