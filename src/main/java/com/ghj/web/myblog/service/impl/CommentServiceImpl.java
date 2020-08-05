package com.ghj.web.myblog.service.impl;

import com.ghj.web.myblog.entity.Comment;
import com.ghj.web.myblog.mapper.CommentMapper;
import com.ghj.web.myblog.service.CommentService;
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
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
