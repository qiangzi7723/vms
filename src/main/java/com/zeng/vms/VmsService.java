package com.zeng.vms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VmsService {

    @Autowired
    private VmsDao vmsDao;

    public VmsUser queryAll() {
        return vmsDao.queryAll();
    }
}
