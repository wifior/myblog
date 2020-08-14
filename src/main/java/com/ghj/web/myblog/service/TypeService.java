package com.ghj.web.myblog.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ghj.web.myblog.entity.Type;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Think
 * @since 2020-08-05
 */
public interface TypeService extends IService<Type> {

    int saveType(Type type);

    Type getType(Long id);

    IPage listType(Page page);

    List<Type> listType();

    int updateType(Type type);

    void deleteType(Long id);

    Type getTypeByName(String name);
}
