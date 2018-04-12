package com.alenasoft.urbanager.resources.hello;

import com.alenasoft.urbanager.api.Result;

import javax.inject.Inject;

public class HelloServiceImpl implements HelloService {

    @Inject
    private ResultDao dao;

    @Override
    public long sumTwoNumbers(int num1, int num2) {
        Result result = new Result("Sum", num1, num2);
        return this.dao.create(result);
    }

    @Override
    public Result getById(long id) {
        return this.dao.getById(id);
    }
}
