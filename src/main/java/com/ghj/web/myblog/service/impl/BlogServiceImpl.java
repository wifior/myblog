package com.ghj.web.myblog.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ghj.web.myblog.entity.Blog;
import com.ghj.web.myblog.entity.vo.BlogVo;
import com.ghj.web.myblog.mapper.BlogMapper;
import com.ghj.web.myblog.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Think
 * @since 2020-08-05
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

    @Autowired
    private BlogMapper blogMapper;

    @Override
    public Blog getBlog(Long id) {
        return null;
    }

    @Override
    public IPage<Blog> listBlog(Page page, BlogVo blog) {
        String title = blog.getTitle();
        Integer type = blog.getTp();
        Boolean recommend = blog.getRecommend();
        int f=1;
        if(recommend==null||!recommend){
           f=0;
        }
        return blogMapper.selectListPage(page,title,type,f);
    }

    @Override
    public List listRecommendBlogsTop(int i) {
        return null;
    }
}
