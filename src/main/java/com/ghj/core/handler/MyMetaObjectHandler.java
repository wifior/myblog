package com.ghj.core.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @ClassName MyMetaObjectHandler
 * @Description TODO
 * @Author Think
 * @Date 2020/8/4 23:31
 * @Version 1.0
 **/
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    //insertFill在mp执行添加操作时运行
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("createTime",new Date(),metaObject);
        this.setFieldValByName("updateTime",new Date(),metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updateTime",new Date(),metaObject);
    }
}
