package com.edu.course.services.exceptions;

public class ResourceNotFoundedException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundedException(Object id){
        super("Resource not found. id: " + id);
    }
}
