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

/*Referece:
https://howtodoinjava.com/java/regex/start-end-of-string/
https://regex101.com/
https://www.geeksforgeeks.org/check-if-a-string-contains-only-alphabets-in-java-using-regex/
https://stackoverflow.com/questions/9241651/java-string-should-contain-only-letters-and-dot
https://stackoverflow.com/questions/9289451/regular-expression-for-alphabets-with-spaces
https://www.jrebel.com/blog/java-regular-expressions-cheat-sheet
https://www.tutorialspoint.com/java/java_string_matches.htm
*/

