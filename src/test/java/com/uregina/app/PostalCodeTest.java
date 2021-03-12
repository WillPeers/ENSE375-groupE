package com.uregina.app;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import jdk.jfr.Timestamp;

/**
 * Unit test for simple PostalCode.
 */
public class PostalCodeTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void ValidPostalCodeTrue() {
        PostalCode code = new PostalCode("K1B-4J2");
        assertTrue(isValidPostalCode(code));
    }

    @Test
    public void InvalidPostalCode_BadPrefix() {
        PostalCode code = new PostalCode("K2B-4J2");
        assertFalse(isValidPostalCode(code));
    }

    @Test
    public void InvalidPostalCode_VindexOutOfRange() {
        PostalCode code = new PostalCode("K1Z-4J2");
        assertFalse(isValidPostalCode(code));
    }

    @Test
    public void InvalidPostalCode_VindexNotChar() {
        PostalCode code = new PostalCode("K11-4J2");
        assertFalse(isValidPostalCode(code));
    }

    @Test
    public void InvalidPostalCode_HindexNotInt() {
        PostalCode code = new PostalCode("K1B-CJ2");
        assertFalse(isValidPostalCode(code));
    }

    @Test
    public void InvalidPostalCode_NoDash() {
        PostalCode code = new PostalCode("K1B4J2");
        assertFalse(isValidPostalCode(code));
    }

    @Test
    public void InvalidPostalCode_XisNotUpper() {
        PostalCode code = new PostalCode("K1B-4j2");
        assertFalse(isValidPostalCode(code));
    }

    @Test
    public void InvalidPostalCode_XisNotLetter() {
        PostalCode code = new PostalCode("K1B-432");
        assertFalse(isValidPostalCode(code));
    }

    @Test
    public void InvalidPostalCode_YisNotInt() {
        PostalCode code = new PostalCode("K1B-4JX");
        assertFalse(isValidPostalCode(code));
    }

    @Test
    public void ConstructorThrowsException() {
        
    }

    @Test
    public void ConstructorWorks() {
        PostalCode code = new PostalCode("K1B-4J2");

        assertEquals(code.getRegionHorizontalIndex(), 4);
        assertEquals(code.getRegionVerticalIndex(), 2);
        assertEquals(code.getPostalCode(), "K1B-4J2");
    }
}
