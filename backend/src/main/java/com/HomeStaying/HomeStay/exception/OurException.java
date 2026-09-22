package com.HomeStaying.HomeStay.exception;

public class OurException extends RuntimeException{

    public String message;

    public OurException(String s) {
        super(s);
    }
}
