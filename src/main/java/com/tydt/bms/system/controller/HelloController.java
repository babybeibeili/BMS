package com.tydt.bms.system.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tydt.bms.system.model.User;
import com.tydt.bms.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HelloController {
    @Autowired
    UserService userService;

    @GetMapping("/query")
    @ResponseBody
    public List<User> getUserList(){
        PageHelper.startPage(1,5);
        List<User> list = userService.selectAll();
        PageInfo<User> pageInfo = new PageInfo<User>(list);
        List<User> rs = pageInfo.getList();
        return rs;
    }
}
