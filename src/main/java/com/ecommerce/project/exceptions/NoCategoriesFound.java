package com.ecommerce.project.exceptions;

public class NoCategoriesFound extends RuntimeException{
    public NoCategoriesFound(String message){
        super(message);
    }
}
