package com.ghj.web.myblog.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ghj.web.myblog.entity.Blog;
import com.ghj.web.myblog.entity.vo.BlogVo;
import com.ghj.web.myblog.service.BlogService;
import com.ghj.web.myblog.service.TagService;
import com.ghj.web.myblog.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

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
    private TagService tagService;

    @Autowired
    private TypeService typeService;

    @GetMapping("/blogs")
    public String list(@RequestParam(value = "pageSize", defaultValue = "5",required = false) int pageSize, @RequestParam(value = "pageNum",defaultValue = "1",required = false) int pageNum, BlogVo blog, Model model){
        Page page = new Page(pageNum,pageSize);
        model.addAttribute("types",typeService.listType());
        model.addAttribute("page",blogService.listBlog(page,blog));
        return "admin/blogs";
    }

    @PostMapping("/blogs/search")
    public String search(@RequestParam(value = "pageSize", defaultValue = "5",required = false) int pageSize, @RequestParam(value = "pageNum",defaultValue = "1",required = false) int pageNum, BlogVo blog, Model model){
        Page page = new Page(pageNum,pageSize);
        model.addAttribute("page",blogService.listBlog(page,blog));
        return "admin/blogs :: blogList";
    }

    @GetMapping("/blogs/input")
    public String input(Model model){
        model.addAttribute("types",typeService.listType());
        model.addAttribute("tags",tagService.list());
        model.addAttribute("blog",new Blog());
        return "admin/blogsInput";
    }

    @GetMapping("/blogs/{id}/input")
    public String editInput(@PathVariable Long id, Model model){
        model.addAttribute("types",typeService.listType());
        model.addAttribute("tags",tagService.list());
        model.addAttribute("blog",blogService.getBlog(id));
        return "admin/blogsInput";
    }

    @PostMapping("/blogs")
    public String post(Blog blog, RedirectAttributes attributes, HttpSession session){
        boolean b = blogService.saveOrUpdate(blog);
        if(b){
            attributes.addFlashAttribute("message","操作成功");
        }else {
            attributes.addFlashAttribute("message","操作失败");
        }
        return "redirect:/admin/blogs";
    }

    @GetMapping("/blogs/{id}/delete")
    public String del(@PathVariable Long id, RedirectAttributes attributes){
        boolean b =blogService.removeById(id);
        if(b){
            attributes.addFlashAttribute("message","操作成功");
        }else {
            attributes.addFlashAttribute("message","操作失败");
        }
        return "redirect:/admin/blogs";
    }
}

