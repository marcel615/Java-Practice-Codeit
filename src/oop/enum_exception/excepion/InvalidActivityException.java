package oop.enum_exception.excepion;

public class InvalidActivityException extends RuntimeException {



    //ctor
    public InvalidActivityException(String message) {
        super(message);
    }
}
