package com.young.pojo;

public class HTTPResponse {
    private int code;
    private String message;
    private Object data;

    public HTTPResponse(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }


    @Override
    public String toString() {
        return "HTTPResponse{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
