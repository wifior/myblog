package com.ghj.web.myblog.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ghj.web.myblog.entity.Blog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ghj.web.myblog.entity.vo.BlogVo;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Think
 * @since 2020-08-05
 */
public interface BlogMapper extends BaseMapper<Blog> {

    IPage<Blog> selectListPage(Page page, Blog blog);

    IPage<Blog> selectListPage(Page page, @Param("title") String title, @Param("type")Integer type, @Param("recommend")int f);

    BlogVo selectBlogVoById(Long id);
}
