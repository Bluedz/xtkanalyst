package com.xtk.xtkanalyst.service;

import com.xtk.xtkanalyst.entity.Tst;
import com.xtk.xtkanalyst.mapper.TstMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TstService {
    @Autowired
    TstMapper tstMapper;
    public Tst Sel(){
        return tstMapper.sl1();
    }
}
