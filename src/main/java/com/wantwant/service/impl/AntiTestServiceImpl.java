package com.wantwant.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wantwant.mapper.AntiTestMapper;
import com.wantwant.pojo.AntiTest;
import com.wantwant.service.AntiTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: Sqlserver_springboot
 * @description: ${description}
 * @author: Sunhaoyue
 * @create: 2019/06/17 16:48
 */
@Service
public class AntiTestServiceImpl implements AntiTestService {

    @Autowired
    private AntiTestMapper antiTestMapper;
    //显示所有数据
    @Override
    public List<AntiTest> selectAllAntiTest() {
        List<AntiTest> list=antiTestMapper.selectAllAntiTest();
        return list;
    }

    //增加、修改信息
   @Override
    public String insertAntiTest(AntiTest antiTest) {
       //增加电脑
       if (antiTest.getComputername()==null){
            int i=antiTestMapper.insert(antiTest);
            return "success";
       }
       return null;
    }
    //分页
    public PageInfo<AntiTest> getUserWithPage1(AntiTest antiTest, Integer pageIndex, Integer pageSize) {
        PageHelper.startPage(pageIndex,pageSize);
        List<AntiTest> antiTests=antiTestMapper.selectAllAntiTest();
        PageInfo<AntiTest> pageHelperInfo=new PageInfo<>(antiTests);
       return pageHelperInfo;
    }


}
