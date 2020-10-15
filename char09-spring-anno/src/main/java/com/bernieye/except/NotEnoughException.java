package com.bernieye.except;
//custom Runtime Exception
public class NotEnoughException extends RuntimeException{
    public NotEnoughException(){
        super();
    }

    public NotEnoughException(String message){
        super(message);
    }
}
