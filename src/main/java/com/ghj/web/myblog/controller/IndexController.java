package com.ghj.web.myblog.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ghj.web.myblog.service.BlogService;
import com.ghj.web.myblog.service.TagService;
import com.ghj.web.myblog.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName IndexController
 * @Description TODO
 * @Author Think
 * @Date 2020/8/18 21:38
 * @Version 1.0
 **/
@Controller
public class IndexController {

    @Autowired
    private BlogService blogService;

    @Autowired
    private TypeService typeService;

    @Autowired
    private TagService tagService;

    @GetMapping("/")
    public String index(@RequestParam(value = "pageSize", defaultValue = "5",required = false) int pageSize,@RequestParam(value = "pageNum",defaultValue = "1",required = false) int pageNum, Model model){
        Page page = new Page(pageNum,pageSize);
        model.addAttribute("page",blogService.listBlog(page,null));
        model.addAttribute("types",typeService.listTypeTop(6));
        model.addAttribute("tags",tagService.listTagTop(10));
        model.addAttribute("recommendBlogs",blogService.listRecommendBlogsTop(8));
        return "index";
    }
}
