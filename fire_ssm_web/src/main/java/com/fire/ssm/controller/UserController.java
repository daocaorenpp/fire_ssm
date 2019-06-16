package com.fire.ssm.controller;

import com.fire.ssm.domain.User;
import com.fire.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    //    查询全部产品
    @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception{
        ModelAndView mv = new ModelAndView();
        List<User> ps = userService.findAll();
        mv.addObject("userList",ps);
        mv.setViewName("userlist");
        return mv;
    }
}
