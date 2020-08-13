package com.ghj.web.myblog.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ghj.web.myblog.entity.Type;
import com.ghj.web.myblog.mapper.TypeMapper;
import com.ghj.web.myblog.service.TypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Think
 * @since 2020-08-05
 */
@Service
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type> implements TypeService {

    @Autowired
    private TypeMapper typeMapper;

    @Override
    public int saveType(Type type) {
        return typeMapper.insert(type);
    }

    @Override
    public Type getType(Long id) {
        return typeMapper.selectById(id);
    }

    @Override
    public IPage<Type> listType(Page page) {
        return typeMapper.selectPage(page,null);
    }

    @Override
    public int updateType( Type type) {
        return typeMapper.updateById(type);
    }

    @Override
    public void deleteType(Long id) {
        typeMapper.deleteById(id);
    }

    @Override
    public Type getTypeByName(String name) {
        return typeMapper.getTypeByName(name);
    }
}
