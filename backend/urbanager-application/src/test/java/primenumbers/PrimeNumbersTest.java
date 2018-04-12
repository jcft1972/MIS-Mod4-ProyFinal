package com.alenasoft.urbanager.resources.primenumbers;


import com.alenasoft.urbanager.api.PrimeNumbers;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Based on:
 *
 *  Example to Integration test in UnitTest style for ExampleResource.
 * @author Luis Roberto Perez
 * @since 20-05-17
 */

public class PrimeNumbersTest {

    private PrimeNumbers primeNumber;

    @Before
    public void setUp() {
        primeNumber = new PrimeNumbers();
    }

    @Test
    public void testValidateIfNumberIsCompose(){
        this.primeNumber.setNumber(1000);
        assertFalse(this.primeNumber.getIsPrime());
    }
    @Test
    public void testValidateIfNumberIsPrime(){
        this.primeNumber.setNumber(151);
        assertTrue(this.primeNumber.getIsPrime());

    }

    @Test
    public void testValidateIfNumberIsOne(){
        this.primeNumber.setNumber(1);
        assertTrue(this.primeNumber.getIsPrime());

    }
    @Test
    public void testValidateIfNumberIsZero(){
        this.primeNumber.setNumber(0);
        assertFalse(this.primeNumber.getIsPrime());
    }
    @Test
    public void testValidateIfNumberIsNegative(){

        this.primeNumber.setNumber(-1);
        assertFalse(this.primeNumber.getIsPrime());
    }

    @Test
    public void testFindNextPrime(){
        this.primeNumber.setNumber(13);
        assertEquals(17,this.primeNumber.nextPrimeNumber());
    }


}
