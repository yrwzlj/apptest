package com.yrw.processor;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yrw.common.CommonResult;
import com.yrw.domain.dto.UserDTO;
import com.yrw.domain.type.request.UserRequestType;
import com.yrw.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: rw.yang
 * @DateTime: 2025/4/12
 **/
@Component
public class UserProcessor {

    @Resource
    private UserMapper userMapper;

    private static UserDTO buildUserDTO(UserRequestType requestType) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUid(requestType.getUid());
        userDTO.setPhone(requestType.getPhone());
        userDTO.setUsername(requestType.getUsername());
        return userDTO;
    }

    public CommonResult signUp(UserRequestType requestType) {
        CommonResult result = (new CommonResult()).init();

        QueryWrapper<UserDTO> queryWrapper = new QueryWrapper();
        queryWrapper.eq("username", requestType.getUsername());
        List<UserDTO> userDTOS = userMapper.selectList(queryWrapper);
        if (userDTOS != null && !userDTOS.isEmpty()) {
            return (CommonResult) result.success().end();
        }

        int insert = userMapper.insert(buildUserDTO(requestType));
        return (CommonResult) result.success().end();
    }
}
