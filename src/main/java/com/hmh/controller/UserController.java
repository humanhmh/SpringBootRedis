package com.hmh.controller;

import com.hmh.bean.UserInfo;
import com.hmh.service.RedisService;
import com.hmh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 62450 on 2018/5/24.
 */
@Controller
@RequestMapping(path="/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private RedisService redisService;

    //从redis获取某个用户
    @RequestMapping(value = "/getuserfromredis", method = RequestMethod.GET)
    @ResponseBody
    public UserInfo getRedis(@RequestParam String key) {
        return (UserInfo)redisService.get(key);
    }

    //获取所有用户
    @RequestMapping(value = "/getusers", method = RequestMethod.GET)
    @ResponseBody
    public Page<UserInfo> list(Model model, Pageable pageable){
        return userService.findAll(pageable);
    }

    //添加用户
    @GetMapping(value="/adduser")
    @ResponseBody
    public String addUser(@RequestParam String password, @RequestParam String username) {
        UserInfo user = new UserInfo();
        user.setPassword(password);
        user.setUsername(username);
        System.out.println(user);
//        userService.saveUser(user);
        redisService.add(user.getId()+"", user,100L);
        return "Saved";
    }
}
