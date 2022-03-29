package com.fonyou.marlontest.domains.util;

import org.springframework.http.HttpStatus;

public class GenericResponse {

    private HttpStatus statusCode;
    private String message;
    private Object object;

    public GenericResponse() {
    }

    public GenericResponse(HttpStatus statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public GenericResponse(HttpStatus statusCode, String message, Object object) {
        this.statusCode = statusCode;
        this.message = message;
        this.object = object;
    }

    public HttpStatus getStatusCode() {
        return statusCode;
    }

    public GenericResponse setStatusCode(HttpStatus statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public GenericResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getObject() {
        return object;
    }

    public GenericResponse setObject(Object object) {
        this.object = object;
        return this;
    }

    @Override
    public String toString() {
        return "Response{" +
                "statusCode=" + statusCode +
                ", message='" + message + '\'' +
                ", object=" + object +
                '}';
    }
}
