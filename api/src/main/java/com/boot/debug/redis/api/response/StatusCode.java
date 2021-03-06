package com.boot.debug.redis.api.response;

/**
 * 状态码枚举
 * @Author:debug (SteadyJack)
 * @Link: weixin-> debug0868 qq-> 1948831260
 * @Date: 2019/10/29 17:50
 **/
public enum  StatusCode {

    Success(200,"成功"),
    Fail(-1,"失败"),

    InvalidParams(10010,"非法的参数！"),

    UserEmailHasExist(10011,"当前用户邮箱已存在!"),

    ;

    private Integer code;
    private String msg;

    StatusCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}


































