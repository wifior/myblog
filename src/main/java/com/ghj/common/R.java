package com.ghj.common;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName R
 * @Description TODO
 * @Author Think
 * @Date 2020/8/3 20:11
 * @Version 1.0
 **/
@Data
public class R {

    private Boolean success;

    private Integer code;

    private String message;

    private Map<String,Object> data = new HashMap<>();

    public R() {
    }

    public static R ok(){
        R r= new R();
        r.setSuccess(true);
        r.setCode(ResultCode.SUCCESS);
        r.setMessage("操作成功！");
        return r;
    }

    public static R error(){
        R r= new R();
        r.setSuccess(false);
        r.setCode(ResultCode.ERROR);
        r.setMessage("操作失败！");
        return r;
    }

    public R message(String msg){
        this.setMessage(msg);
        return this;
    }

    public static R data(Map<String,Object> map){
        R r= new R();
        r.setSuccess(true);
        r.setCode(ResultCode.SUCCESS);
        r.setMessage("操作成功！");
        r.setData(map);
        return r;
    }
}
