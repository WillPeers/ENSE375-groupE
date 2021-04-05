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
		this.list = new ArrayList<String>();
	}
	//Check if the list is empty
	@Test
	public void testListInit(){
		assertTrue(this.list.isEmpty());
		assertTrue(this.list.size() == 0);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testInvalidCapacity(){
		this.list = new ArrayList<String>(-1);
	}
	//Add a patient into index 0 in the list
    //List size equal 1
	@Test
	public void testAddPatient(){
		this.list.add(0, "Patient");
		assertEquals("Patient", this.list.get(0));
		assertTrue(this.list.size() == 1);
	}
	
	//Add patient's first name in the index 0
    //assert false if list is empty
	@Test
	public void addPatientFirstName(){
		this.list.add(0, "firstName");
		assertFalse(this.list.isEmpty());
		assertEquals(1, this.list.size());
	}

	//Add patient's last name in the index 0
    //assert false if list is empty
	@Test
	public void addPatientLastName(){
		this.list.add(0, "lastName");
		assertFalse(this.list.isEmpty());
		assertEquals(1, this.list.size());
	}
	//Add patient's age in the index 0
    //assert false if list is empty
	@Test		
    public void addPatientAge() {					
        this.list.add(0, "Age");					
        assertFalse(this.list.isEmpty());			
        assertEquals(1, this.list.size());			
    }	

	//Add patient's address in the index 0
    //assert false if list is empty
	@Test
	public void addPatientAddress(){
		this.list.add(0, "Address");
		assertFalse(this.list.isEmpty());
		assertEquals(1, this.list.size());
	}
	//Add patient's postal Code in the index 0
    //assert false if list is empty
	@Test
	public void addPostalCode(){
		this.list.add(0, "PostalCode");
		assertFalse(this.list.isEmpty());
		assertEquals(1, this.list.size());
	}

	//Add patient's Health Card in the index 0
    //assert false if list is empty
	@Test
	public void addHealthCard(){
		this.list.add(0, "HealthCard");
		assertFalse(this.list.isEmpty());
		assertEquals(1, this.list.size());
	}

    //Add patient's City of resident in the index 0
    //assert false if list is empty
	@Test
	public void addCity(){
		this.list.add(0, "City");
		assertFalse(this.list.isEmpty());
		assertEquals(1, this.list.size());
	}
	//Add patient's Cell Phone in the index 0
    //assert false if list is empty
	@Test
	public void addCell(){
		this.list.add(0, "cellPhone");
		assertFalse(this.list.isEmpty());
		assertEquals(1, this.list.size());
	}

}
