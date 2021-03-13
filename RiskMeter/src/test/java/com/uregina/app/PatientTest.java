package com.uregina.app;

import static org.junit.Assert.assertTrue;

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
    public void Validate_Alphabetic_True()
    {
        Patient name = new Patient();
        boolean legalname = name.ValidateName("Patient"); 
        assertTrue(legalname);
    }
}
