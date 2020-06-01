package com.remango.blog.service.impl;

import com.remango.blog.entity.Log;
import com.remango.blog.entity.PageList;
import com.remango.blog.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2019/3/8.
 */

@Service
public class LogServiceImpl implements LogService {
    @Override
    public PageList<Log> queryList(String key,  Integer offset, Integer limit) {
        PageList<Log> logPageList = new PageList<>();
        return logPageList;
    }


    @Override
    public void saveLog(Log log) {
        log.setCreateTime(new Date());
    }
}
