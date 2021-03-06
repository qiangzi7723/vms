package com.zeng.vms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class VmsController {
    @RequestMapping("status")
    public String statusMtd(@RequestParam long uid,@RequestParam String name) {
        System.out.println(uid+name);
        return "Good " + uid + " " +name;
    }

    @Autowired
    private VmsDao vmsDao;

    @GetMapping("query")
    public VmsUser query(){
        return vmsDao.queryAll();
    }

    @GetMapping("testResponse")
    public ResponseEntity<Result> testRes(){
        Result res = new Result("Good Thing!",0);
        return ResponseEntity.ok(res);
    }

    @GetMapping("normal")
    public ResponseEntity<Result> normal(){
        Result res = new Result();
        return ResponseEntity.ok(res);
    }

    @GetMapping("dataJson")
    public ResponseEntity<Result> dataJson(){
        Result res = new Result();
        res.putData("egg","10");
        return ResponseEntity.ok(res);
    }
}
