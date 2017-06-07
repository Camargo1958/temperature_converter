package com.packtpub.mastering.selenium.pageobjects;

/**
 * Created by Neo on 07/06/2017.
 */
public class WrongPageException extends RuntimeException{
    public WrongPageException(String message){
        super(message);
    }
}
