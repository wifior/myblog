package com.ghj.web.myblog.service;

import com.ghj.web.myblog.entity.Tag;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Think
 * @since 2020-08-05
 */
public interface TagService extends IService<Tag> {

    List listTagTop(int i);
}
