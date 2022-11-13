package com.bosch.dynamicform.exception;

public class ResourceNotFound extends BadRequestException {
    public ResourceNotFound(String message){
        super(message);
    }
}
