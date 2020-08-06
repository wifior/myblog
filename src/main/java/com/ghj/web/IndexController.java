package com.ghj.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName IndexController
 * @Description TODO
 * @Author Think
 * @Date 2020/8/3 19:56
 * @Version 1.0
 **/
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/blog")
    public String blog(){
        return "blog";
    }
    @GetMapping("/about")
    public String about(){
        return "about";
    }
    @GetMapping("/archives")
    public String archives(){
        return "archives";
    }
    @GetMapping("/login")
    public String login(){
        return "admin/login";
    }
}
