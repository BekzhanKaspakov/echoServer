package com.bekzhankaspakov.echoServer.model;

import lombok.Data;

@Data
public class ServiceResponse<T> {

    private String status;
    private T data;

    public ServiceResponse(String status, T data){
        this.status = status;
        this.data = data;
    }

}