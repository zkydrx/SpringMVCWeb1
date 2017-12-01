package com.google.springmvc.controller;

import com.google.springmvc.pojo.UserDto;
import com.google.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-11-30
 * Time: 17:21
 * Description:
 */
@Controller
public class UserController
{

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/index")
    public ModelAndView indexPage()
    {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("index");

        return modelAndView;
    }

    @RequestMapping(value = "register")
    public ModelAndView register()
    {
        //        ModelAndView modelAndView = new ModelAndView();
        //        modelAndView.setViewName("register");
        return new ModelAndView("register");
    }

    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public ModelMap insertUser(@RequestParam String name,
                               @RequestParam String password,
                               @RequestParam String phone,
                               @RequestParam String email,
                               @RequestParam String address)
    {
        UserDto userDto = new UserDto();
        userDto.setUuid(UUID.randomUUID().toString().replaceAll("-", ""));
        userDto.setName(name);
        userDto.setPassword(password);
        userDto.setPhone(phone);
        userDto.setEmail(email);
        userDto.setAddress(address);
        boolean booleanInsertUser = userService.insertuser(userDto);

        ModelMap modelMap = new ModelMap();
        if (booleanInsertUser)
        {
            modelMap.addAttribute("status", "Successful");
        }
        else
        {
            modelMap.addAttribute("status", "Faild");
        }
        return modelMap;
    }
}
