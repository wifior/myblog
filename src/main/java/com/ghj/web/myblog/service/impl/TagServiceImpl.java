package com.ghj.web.myblog.service.impl;

import com.ghj.web.myblog.entity.Tag;
import com.ghj.web.myblog.mapper.TagMapper;
import com.ghj.web.myblog.service.TagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements TagService {

    @Override
    public List listTagTop(int i) {
        return null;
    }
}
