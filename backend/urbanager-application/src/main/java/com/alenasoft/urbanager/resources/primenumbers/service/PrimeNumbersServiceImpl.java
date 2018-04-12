package com.alenasoft.urbanager.resources.primenumbers.service;

import com.alenasoft.urbanager.api.PrimeNumbers;

import java.util.List;


public class PrimeNumbersServiceImpl implements PrimeNumbersService{

    private PrimeNumbers primeNumbers;

    @Override
    public Boolean IsPrime(int number) {
        this.primeNumbers = new PrimeNumbers(number);
        return primeNumbers.getIsPrime();
    }

    @Override
    public int nextPrimeNumber() {
        return this.nextPrimeNumber();
    }

    @Override
    public List<String> firstNPrimeNumbers(int number) {
        this.primeNumbers = new PrimeNumbers(1);
        return this.primeNumbers.printPrimeNumbers(number);
    }
}