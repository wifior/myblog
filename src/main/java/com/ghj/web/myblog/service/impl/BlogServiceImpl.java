package com.ghj.web.myblog.service.impl;

import com.ghj.web.myblog.entity.Blog;
import com.ghj.web.myblog.mapper.BlogMapper;
import com.ghj.web.myblog.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
