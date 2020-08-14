package com.ghj.web.myblog.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ghj.web.myblog.entity.Blog;
import com.ghj.web.myblog.service.BlogService;
import com.ghj.web.myblog.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Think
 * @since 2020-08-05
 */
@Controller
@RequestMapping("/admin")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @Autowired
    private TypeService typeService;

    @GetMapping("/blogs")
    public String list(@RequestParam(value = "pageSize", defaultValue = "5",required = false) int pageSize, @RequestParam(value = "pageNum",defaultValue = "1",required = false) int pageNum, Blog blog, Model model){
        Page page = new Page(pageNum,pageSize);
        model.addAttribute("types",typeService.listType());
        model.addAttribute("page",blogService.listBlog(page,blog));
        return "admin/blogs";
    }

    @GetMapping("/blogs/search")
    public String search(@RequestParam(value = "pageSize", defaultValue = "5",required = false) int pageSize, @RequestParam(value = "pageNum",defaultValue = "1",required = false) int pageNum, Blog blog, Model model){
        Page page = new Page(pageNum,pageSize);
        model.addAttribute("page",blogService.listBlog(page,blog));
        return "admin/blogs :: blogList";
    }
}

