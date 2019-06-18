package com.wantwant.mapper;

import com.wantwant.pojo.AntiTest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
/**
 * @program: Sqlserver_springboot
 * @description: 相当与是dao包
 * @author: Sunhaoyue
 * @create: 2019/06/18 11:34
 */
@Mapper
public interface AntiTestMapper {

    int insert(AntiTest record);

    int insertSelective(AntiTest record);

    List<AntiTest> selectAllAntiTest();
}