package com.alenasoft.urbanager.resources.hello;

import com.alenasoft.urbanager.api.Result;

public interface HelloService {
    long sumTwoNumbers(int num1, int num2);

    Result getById(long id);
}
