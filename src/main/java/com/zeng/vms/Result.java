package com.zeng.vms;

public class Result {
    private String message;

    public Result(String message){
        this.message = message;
    }

    public void setMessage(String message){
        this.message=message;
    }

    public  String getMessage(){
        return message;
    }
}
