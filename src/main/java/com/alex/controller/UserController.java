package com.alex.controller;

import com.alex.pojo.User;
import com.alex.pojo.loginInfo;
import com.alex.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@CrossOrigin  //跨域
@Controller
public class UserController {
    @Autowired
    private ObjectMapper mapper;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)       //注册
    @ResponseBody
    public String addUser(@RequestBody User user, Model model) {

        User user1=userService.loginCheck(user.getUsername());    //先在表里面查一下是否有对应的username，有的话就不能注册。

        if (null==user1){
            userService.addUser(user);
            return "1";
        }else{
            return "0";
        }
    }


    @RequestMapping(value = "/login", method = RequestMethod.POST)                   //登陆
    @ResponseBody
    public String Login(@RequestBody String loginInfo) throws JsonProcessingException {

        loginInfo loginInfo1 = mapper.readValue(loginInfo, loginInfo.class);

        User user = userService.loginCheck(loginInfo1.getUsername());

        System.out.println(loginInfo1.getUsername());

        if (null==user) {
            String info = "用户不存在";
            return "0";
        }
        if (loginInfo1.getPassword().equals(user.getPassword())) {
            String info = "登陆成功";

            return "1";
        } else {
            String info = "密码错误";

            return "-1";
        }
    }

    @RequestMapping(value = "/user/main", method = RequestMethod.GET)      //用户首页
    @ResponseBody
    public User userMain(String username) {
        User user = userService.userMain(username);
        System.out.println(user.toString());
        return user;
    }



    @RequestMapping(value = "/user/modified", method = RequestMethod.POST)              //修改密码
    @ResponseBody
    public String modified(String username, String newpassword) {
        System.out.printf("%s  %s%n", username, newpassword);
        int x=userService.modified(username, newpassword);
        if (x==1){
            return "1";
        }else{
            return "0";
        }
    }


}
