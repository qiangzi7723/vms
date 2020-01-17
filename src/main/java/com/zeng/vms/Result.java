package com.zeng.vms;

import java.util.HashMap;
import java.util.Map;

public class Result {
    private String message;
    private Integer code;
    private Map<String,Object> data = new HashMap<String, Object>();


    public Result(){
        this.message = "OK";
        this.code = 0;
    }

    public Result(String message,Integer code){
        this.message = message;
        this.code = code;
    }

    public void putData(String key,Object value){
        data.put(key,value);
    }

    public Map<String,Object> getData(){
       return data;
    }

    public void setMessage(String message){
        this.message=message;
    }

    public  String getMessage(){
        return message;
    }

    public void setCode(Integer code){
        this.code=code;
    }

    public Integer getCode(){
        return this.code;
    }
}
