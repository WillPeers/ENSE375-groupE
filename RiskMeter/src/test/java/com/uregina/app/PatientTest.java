package com.uregina.app;

import static org.junit.Assert.assertTrue;

import com.uregina.exception.InvalidAgeException;
import com.uregina.exception.InvalidIDException;
import com.uregina.exception.InvalidNameException;
import com.uregina.exception.InvalidPostalCodeException;

import org.junit.Test;

/**
 * Unit test for Patient.
 */
public class PatientTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void SampleTest()
    {
        assertTrue(true);
    }

  
    @Test
    public void Validate_Alphabetic_True() throws InvalidNameException, InvalidAgeException, InvalidIDException, InvalidPostalCodeException
    {
     String Name = "John";
     String ID = null;
     int AGE = 0;
     PostalCode POSTALCODE = null;
     Patient name = new Patient(Name, ID, AGE, POSTALCODE);
     if (name.getName().matches("^[a-zA-Z]*$"))
     {
         assertTrue(true);
     }
     else
     {
         assertTrue(false);
     }
    }


    @Test
    public void Validate_AlphabeticDots_True() throws InvalidNameException, InvalidAgeException, InvalidIDException, InvalidPostalCodeException
    {
        String Name = "John.";
        String ID = null;
        int AGE = 0;
        PostalCode POSTALCODE = null;
        Patient name = new Patient(Name, ID, AGE, POSTALCODE);
        if (name.getName().matches("^[a-zA-Z.]*$"))
        {
            assertTrue(true);
        }
        else
        {
            assertTrue(false);
        } 

    }

    @Test
    public void Validate_AlphabeticSpace_True() throws InvalidNameException, InvalidAgeException, InvalidIDException, InvalidPostalCodeException
    {
        String Name = "John John";
        String ID = null;
        int AGE = 0;
        PostalCode POSTALCODE = null;
        Patient name = new Patient(Name, ID, AGE, POSTALCODE);
        if (name.getName().matches("^[a-zA-Z][a-zA-Z ]+"))
        {
            assertTrue(true);
        }
        else
        {
            assertTrue(false);
        }
    }

    @Test
    public void Validate_AlphabeticDotsSpace_True() throws InvalidNameException, InvalidAgeException, InvalidIDException, InvalidPostalCodeException
    {
        String Name = "John. John";
        String ID = null;
        int AGE = 0;
        PostalCode POSTALCODE = null;
        Patient name = new Patient(Name, ID, AGE, POSTALCODE);
        if (name.getName().matches("^[a-zA-Z][a-zA-Z .]+"))
        {
            assertTrue(true);
        }
        else
        {
            assertTrue(false);
        }
        
    } 
}
