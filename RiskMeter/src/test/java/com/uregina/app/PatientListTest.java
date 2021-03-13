package com.uregina.app;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import java.util.ArrayList;

/**
 * Unit test for PatientList.
 */

public class PatientListTest {
	private ArrayList<String> list;

	/**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

	@Before
	public void addPatient(){
		list = new ArrayList<String>();
	}

	@Test
	public void testListInit(){
		assertTrue(list.isEmpty());
		assertTrue(list.size() == 0);
	}

	@Test (expected = IllegalArgumentException.class)
	public void testInvalidCapacity(){
		list = new ArrayList<String>(-1);
	}

	@Test
	public void testAddPatient(){
		list.add(0, "Patient");
		assertEquals("Patient", list.get(0));
		assertTrue(list.size() == 1);
	}

	@Test
	public void testAddElementNull(){
		try{
			list.add(0, null);
		} catch(NullPointerException e) {

		}
	}

	@Test
	public void testRemovePatient(){
		list.add(0, "patient");
		assertEquals("patient", list.remove(0));
		assertTrue(list.size() == 0);
	}

	@Test 
	(expected = IndexOutOfBoundsException.class)
	public void testRemoveWithEmptyList(){
		list.remove(1);
	}


    /*@Test
    public void addPatient_True(){
        String list;
        assertTrue( list.addPatient() );
    }*/

}
