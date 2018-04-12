package com.alenasoft.urbanager.resources.primenumbers.service;

import java.util.List;

public interface PrimeNumbersService {
    Boolean IsPrime(int number);
    int nextPrimeNumber();
    List<String> firstNPrimeNumbers(int number);
}

