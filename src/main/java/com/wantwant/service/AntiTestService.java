package com.wantwant.service;


import com.wantwant.pojo.AntiTest;


import java.util.List;

/**
 * @program: Sqlserver_springboot
 * @descript
 * ion: 服务层与数据映射层的服务接口
 * @author: Sunhaoyue
 * @create: 2019/06/17 16:41
 */
public interface AntiTestService {

    //增加、修改table
    String insertAntiTest(AntiTest antiTest);

    //查询table
    List<AntiTest> selectAllAntiTest();
}
