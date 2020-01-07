package com.bxk.finalstore.service.ex;

public class ServiceException extends RuntimeException {
    private static final long serialVersionUID  = 1l;
    public ServiceException(String message){
        super(message);
    }
}
