package com.alex.dao;

import com.alex.pojo.Works;

import java.util.List;

public interface WorksMapper {



    //用户新增作品
    int addWorks(Works works);



    //获取所有作品的基本信息
   List<Works> getAllworkers();


   //获得某一个作品的具体信息
    Works getDetail(int works_id);





}
