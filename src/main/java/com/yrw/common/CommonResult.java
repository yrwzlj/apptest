package com.yrw.common;

import com.alibaba.fastjson.JSONObject;

import java.time.LocalDateTime;

/**
 * @desc 返回结果常用类
 * @date 2022/11/26
 */
public class CommonResult extends BaseResult {

    private JSONObject item;

    public CommonResult() {
    }

    public CommonResult(JSONObject item) {
        this.item = item;
    }

    public CommonResult(int msgCode, String errMsg, LocalDateTime receiptDateTime, LocalDateTime returnDateTime) {
        super(msgCode, errMsg, receiptDateTime, returnDateTime);
    }

    public CommonResult(int msgCode, String errMsg, LocalDateTime receiptDateTime, LocalDateTime returnDateTime, String requesterId, JSONObject item) {
        super(msgCode, errMsg, receiptDateTime, returnDateTime);
        this.item = item;
    }

    @Override
    public CommonResult init() {
        super.init();
        this.item = new JSONObject();

        return this;
    }

    public CommonResult success(String key, Object value) {
        super.success();
        if (null != key && null != value) {
            this.item.put(key, value);
        }

        return this;
    }

    public void putItem(String key, Object value) {
        this.item.put(key, value);
    }

    public JSONObject getItem() {
        return this.item;
    }

    public void setItem(JSONObject item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "CommonResult{" +
                "errMsg='" + errMsg + '\'' +
                ", item=" + item +
                '}';
    }

}
