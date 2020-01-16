package com.zeng.vms;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VmsDao {
    VmsUser queryAll();
}
