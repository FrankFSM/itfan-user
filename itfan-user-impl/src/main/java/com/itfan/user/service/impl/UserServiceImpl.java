package com.itfan.user.service.impl;

import com.itfan.user.domain.ItfanUser;
import com.itfan.user.mapper.ItfanUserMapper;
import com.itfan.user.service.UserService;
import java.util.List;
import lombok.Data;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: ralap
 * @date: created at 2018/1/10 23:39
 */
@Log4j2
@RestController
public class UserServiceImpl implements UserService {

    @Autowired
    private ItfanUserMapper itfanUserMapper;


    @Override
    public List<ItfanUser> getAll() {
        List<ItfanUser> userList = itfanUserMapper.selectAll();
        log.info(userList);
        return userList;
    }

    @Override
    public ItfanUser getByUserName(@RequestParam("userName") String userName) {
        ItfanUser itfanUser = itfanUserMapper.selectByUserName(userName);
        return itfanUser;
    }

    @Override
    public ItfanUser getByUserId(Integer userId) {
        ItfanUser user = itfanUserMapper.selectByUserId(userId);
        log.info(user);
        return user;
    }

    @Override
    public Integer addByUserId(@RequestBody ItfanUser user) {
        int count = itfanUserMapper.insert(user);
        log.info(count);
        return count;
    }

    @Override
    public Integer delByUserId(Integer userId) {
        int count = itfanUserMapper.del(userId);
        log.info(count);
        return count;
    }
}
