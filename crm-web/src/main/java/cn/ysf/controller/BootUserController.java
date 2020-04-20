package cn.ysf.controller;

import cn.ysf.bean.BootUser;
import cn.ysf.service.BootUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author YiShunFeng
 * @version 1.0
 * @description cn.ysf.controller
 * @data 2020/4/19
 */
@Controller
@RequestMapping("/bootuser")
public class BootUserController {
    @Autowired
    private BootUserService bootUserService;
    @RequestMapping("/save")
    public String save(BootUser bootUser){
        bootUserService.save(bootUser);
        return "succ";
    }
    @RequestMapping("/input")
    public String toInput(){
        return "input";
    }
}
