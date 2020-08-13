package com.ghj.web.myblog.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ghj.web.myblog.entity.Type;
import com.ghj.web.myblog.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

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
    public String input(Model model){
        model.addAttribute("type",new Type());
       return "admin/typesInput";
    }

    @GetMapping("/types/{id}/input")
    public String editInput(@PathVariable Long id , Model model){
        model.addAttribute("type",typeService.getType(id));
        return "admin/typesInput";
    }

    @GetMapping("/types/{id}/delete")
    public String delInput(@PathVariable Long id , RedirectAttributes attributes){
        typeService.deleteType(id);
        attributes.addFlashAttribute("message","操作成功");
        return "redirect:/admin/types";
    }

    @PostMapping("/types")
    public String post(@Valid Type type, BindingResult result,RedirectAttributes attributes){
        Type type1 = typeService.getTypeByName(type.getName());
        if(type1!=null){
            result.rejectValue("name","nameError","已存在，不能新增");
        }
        if(result.hasErrors()){
            return "admin/typesInput";
        }
        int t = 0;
        if(type.getId()!=null){
            t = typeService.updateType(type);
        }else {
            t = typeService.saveType(type);
        }
        if(t>0){
            attributes.addFlashAttribute("message","操作成功");
        }else {
            attributes.addFlashAttribute("message","操作失败");
        }
        return "redirect:/admin/types";
    }
}

