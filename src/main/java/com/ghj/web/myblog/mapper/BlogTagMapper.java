package com.ghj.web.myblog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ghj.web.myblog.entity.BlogTag;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BlogTagMapper extends BaseMapper<BlogTag> {

    List getTagByBlog(@Param("blogId") Long blogId);
}
