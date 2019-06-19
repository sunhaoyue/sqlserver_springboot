package com.wantwant.controller;

import com.wantwant.pojo.AntiTest;
import com.wantwant.service.AntiTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import javax.jws.WebParam;
import java.util.List;

/**
 * @program: Sqlserver_springboot
 * @description: 电脑视图控制层
 * @author: Sunhaoyue
 * @create: 2019/06/17 16:44
 */

@Controller
public class AntiTestController {
    @Autowired
    private AntiTestService antiTestService;

    //查询所有的设备
    @ResponseBody
    @RequestMapping("/selectAllAntiTest")
    public ModelAndView getAllAntiTest(Model model) throws Exception{
        List<AntiTest> list = antiTestService.selectAllAntiTest();
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.get(1).getComputername());
        model.addAttribute("anti_test",list);
        return new ModelAndView("show_table");
    }


    //增加用户
    @ResponseBody
    @RequestMapping("/insertAntiTest")
    public String insertAntiTest(AntiTest antiTest) {
        return antiTestService.insertAntiTest(antiTest);
    }


}
