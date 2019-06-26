package com.wantwant.controller;

import com.wantwant.pojo.AntiTest;
import com.wantwant.service.LoginService;
import com.wantwant.service.impl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.xml.crypto.Data;
import java.util.Date;

/**
 * @program: Sqlserver_springboot
 * @description: ${description}
 * @author: Sunhaoyue
 * @create: 2019/06/19 16:02
 */

@Controller
public class LoginController {
    @Autowired
    private LoginServiceImpl loginService;

    @RequestMapping(value = {"/loginHtml"})
    public String loginHtml() {
        return "login";
    }

    @RequestMapping(value = {"/userLogin"})
    public ModelAndView userLogin(@RequestParam("username") String username,
                                  @RequestParam("password") String password) {
        ModelAndView mv = new ModelAndView("index2");
        ModelAndView mv2 = new ModelAndView("error");
        AntiTest people = loginService.userlogin(username, password);
        String peoplename = people.getComputername();
        mv.addObject("people_name",peoplename);
        System.out.println("登录过程!");
        if (people != null)
            return mv;
        return mv2;

    }

    @RequestMapping(value = {"/registerpage"})
    public String registerpage() {
        return "register";
    }

    @ResponseBody
    @RequestMapping(value = {"/uregister"})
    public String addUser(@RequestParam("username") String username,
                          @RequestParam("password") String password,
                          @RequestParam("password2") String password2,
                          @RequestParam("createdate") Data createdate,
                          @RequestParam("computecnt") int computecnt) {

        if (!password.equals(password2)) {

            return "两次密码不相同，注册失败！！";
        } else {
            int res = loginService.adduser(username, password, (Date) createdate, computecnt);

            if (res == 0) {
                return "注册失败！";
            } else {
                return "注册成功！";
            }
        }
    }
}