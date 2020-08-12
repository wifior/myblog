package com.ghj.web.myblog.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ghj.web.myblog.entity.Type;
import com.ghj.web.myblog.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
public class TypeController {

    @Autowired
    private TypeService typeService;

    @GetMapping("/types")
    public String types(@RequestParam(value = "pageSize", defaultValue = "5",required = false) int pageSize,@RequestParam(value = "pageNum",defaultValue = "1",required = false) int pageNum, Model model){
        Page page = new Page(pageNum,pageSize);
        model.addAttribute("page",typeService.listType(page));
        return "admin/types";
    }

    @GetMapping("/types/input")
    public String input(){
       return "admin/typesInput";
    }

    @PostMapping("/types")
    public String post(Type type){
        int t = typeService.saveType(type);
        return "redirect:/admin/types";
    }
}

