package com.alenasoft.urbanager.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.Table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// POJO: Plain Old Java Object
@Entity
@Table(appliesTo = "Result")
public class Result {

    /**
     * Empty constructor, this is needed for Jackson parsing.
     */
    public Result(){
    }

    public Result(String operation, int number1, int number2){
        this.operation = operation;
        this.number1 = number1;
        this.number2 = number2;
        this.result = number1 + number2;
    }

    @Id
    @JsonProperty
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @JsonProperty
    public String operation;

    @JsonProperty
    public int number1;

    @JsonProperty
    public int number2;

    @JsonProperty
    public int result;
}

