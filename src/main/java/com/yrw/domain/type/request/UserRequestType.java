package com.yrw.domain.type.request;

import com.baomidou.mybatisplus.annotation.TableName;
import domain.DataEntity;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @desc 用户实体类
 * @date 2022/11/26
 */
@Data
@Accessors(chain = true)
@TableName("`user`")
public class UserRequestType extends DataEntity<UserRequestType> {

    private String uid;

    private String phone;

    private String username;
}
