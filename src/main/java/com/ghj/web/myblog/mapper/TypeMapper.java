package com.ghj.web.myblog.mapper;

import com.ghj.web.myblog.entity.Type;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Think
 * @since 2020-08-05
 */
public interface TypeMapper extends BaseMapper<Type> {

    Type getTypeByName(@Param("name") String name);


    Type getType(@Param("id") Long id);
}
