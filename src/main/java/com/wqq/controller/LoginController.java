package com.wqq.controller;

import com.wqq.dao.UUserMapper;
import com.wqq.po.UUser;
import com.wqq.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/login")
public class LoginController {
    @Resource
    UserService userService;

//    @ResponseBody
    @RequestMapping("/user")
    public String find(Model model) {
        model.addAttribute("ss",userService.find());
        return "user";
    }

    @RequestMapping("/sign")
    public String sign() {
        return "sign";
    }
}
