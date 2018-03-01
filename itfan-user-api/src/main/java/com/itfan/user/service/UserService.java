package com.itfan.user.service;

import com.itfan.user.domain.ItfanUser;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: ralap
 * @date: created at 2018/1/10 23:38
 */
public interface UserService {

    /**
     * 获取所有用户
     */
    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    List<ItfanUser> getAll();

    /**
     * 根据UserName获取用户
     */
    @RequestMapping(value = "/getByUserName", method = RequestMethod.GET)
    ItfanUser getByUserName(@RequestParam("userName") String userName);

    /**
     * 根据UserId获取用户
     */
    @RequestMapping(value = "/getByUserId", method = RequestMethod.GET)
    ItfanUser getByUserId(@RequestParam("userId") Integer userId);

    /**
     * 添加用户
     */
    @RequestMapping(value = "/addByUserId", method = RequestMethod.POST)
    Integer addByUserId(@RequestBody ItfanUser user);

    /**
     * 删除用户根据UserId
     */
    @RequestMapping(value = "/delByUserId", method = RequestMethod.GET)
    Integer delByUserId(@RequestParam("userId") Integer userId);

}
