package com.ghj.web.myblog.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ghj.web.myblog.entity.Blog;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ghj.web.myblog.entity.vo.BlogVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Think
 * @since 2020-08-05
 */
public interface BlogService extends IService<Blog> {

    Blog getBlog(Long id);

    IPage<Blog> listBlog(Page page, BlogVo blog);

    List listRecommendBlogsTop(int i);
}
