package com.yrw.service;

import com.yrw.common.CommonResult;
import com.yrw.domain.type.request.UserRequestType;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import com.yrw.processor.UserProcessor;

/**
 * @Author: rw.yang
 * @DateTime: 2025/4/12
 **/
@Service
public class UserService {

    @Resource
    private UserProcessor userProcessor;

    public CommonResult signUp(UserRequestType requestType) {
        return userProcessor.signUp(requestType);
    }
}
