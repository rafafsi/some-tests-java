package com.test;

import org.junit.Test;

import static org.junit.Assert.*;


public class AssertTests {

    @Test
    //comparing byte per byte inside an array
    public void testAssertArrayEquals() {
        byte[] expected = "teste".getBytes();
        byte[] actual = "teste".getBytes();
        assertArrayEquals(expected, actual);
    } //java.lang.AssertionError: array length  s differed, expected.length=5 actual.length=6


    //comparing only to string type
    @Test
    public void testAssertEquals() {
        assertEquals("text", "text");
    }//org.junit.ComparisonFailure:

    //comparing with a boolean value
    @Test
    public void testAssertFalse() {
        assertFalse(false);
    }

    //to garantee that an expression is not null
    @Test
    public void testAssertNotNull() {
        assertNotNull(new Object());
    }

    //to verify if that these objects aren't the same
    @Test
    public void testAssertNotSame() {
        assertNotSame(new Object(), new Object());
    }

    //to garantee that some object is null
    @Test
    public void testAssertNull() {
        assertNull(null);
    }

    //to garantee that these objects are the same
    @Test
    public void testAssertSame() {
        Integer aNumber = 54;
        assertSame(aNumber, aNumber);
    }

}
