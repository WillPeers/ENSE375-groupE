/*
Tested With:
javac -d bin -cp "bin;junit-platform-console-standalone-1.7.0-all.jar" ./test/AddPatientTest.java
run with:
java -jar junit-platform-console-standalone-1.7.0-all.jar -cp bin --scan-class-path

Using "junit-platform-console-standalone-1.7.0-all.jar"
*/
package com.uregina.app;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Before;
import java.util.ArrayList;
/*
Adding a patient information into the list.
*/

public class AddPatientTest2 {
	private ArrayList<String> list;
	
	@Before
	public void addPatient(){
		list = new ArrayList<String>();
	}
	//Check if the list is empty
	@Test
	public void testListInit(){
		assertTrue(list.isEmpty());
		assertTrue(list.size() == 0);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testInvalidCapacity(){
		list = new ArrayList<String>(-1);
	}
	//Add a patient into index 0 in the list
    //List size equal 1
	@Test
	public void testAddPatient(){
		list.add(0, "Patient");
		assertEquals("Patient", list.get(0));
		assertTrue(list.size() == 1);
	}
	
	//Add patient's first name in the index 0
    //assert false if list is empty
	@Test
	public void addPatientFirstName(){
		list.add(0, "firstName");
		assertFalse(list.isEmpty());
		assertEquals(1, list.size());
	}

	//Add patient's last name in the index 0
    //assert false if list is empty
	@Test
	public void addPatientLastName(){
		list.add(0, "lastName");
		assertFalse(list.isEmpty());
		assertEquals(1, list.size());
	}
	//Add patient's age in the index 0
    //assert false if list is empty
	@Test		
    public void addPatientAge() {					
        list.add(0, "Age");					
        assertFalse(list.isEmpty());			
        assertEquals(1, list.size());			
    }	

	//Add patient's address in the index 0
    //assert false if list is empty
	@Test
	public void addPatientAddress(){
		list.add(0, "Address");
		assertFalse(list.isEmpty());
		assertEquals(1, list.size());
	}
	//Add patient's postal Code in the index 0
    //assert false if list is empty
	@Test
	public void addPostalCode(){
		list.add(0, "PostalCode");
		assertFalse(list.isEmpty());
		assertEquals(1, list.size());
	}

	//Add patient's Health Card in the index 0
    //assert false if list is empty
	@Test
	public void addHealthCard(){
		list.add(0, "HealthCard");
		assertFalse(list.isEmpty());
		assertEquals(1, list.size());
	}

    //Add patient's City of resident in the index 0
    //assert false if list is empty
	@Test
	public void addCity(){
		list.add(0, "City");
		assertFalse(list.isEmpty());
		assertEquals(1, list.size());
	}
	//Add patient's Cell Phone in the index 0
    //assert false if list is empty
	@Test
	public void addCell(){
		list.add(0, "cellPhone");
		assertFalse(list.isEmpty());
		assertEquals(1, list.size());
	}

}
