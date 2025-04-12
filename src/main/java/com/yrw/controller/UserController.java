package com.yrw.controller;


import com.yrw.common.CommonResult;
import com.yrw.domain.type.request.UserRequestType;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.yrw.service.UserService;

@Slf4j
@CrossOrigin("*")
@RestController()
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping(value = "/signUp")
    public CommonResult signUp(UserRequestType requestType) {
        return userService.signUp(requestType);
    }

}