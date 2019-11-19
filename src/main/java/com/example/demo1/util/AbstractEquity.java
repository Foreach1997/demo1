package com.example.demo1.util;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo1.entity.Student;
import com.example.demo1.service.StudentService;
import com.example.demo1.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class AbstractEquity {

    public abstract void beanMatch(List<UserVO> userVOs);
    //项目中做删除操作
    public abstract void del();
    //
    public abstract void saveOrUpdate();

    public abstract String finish();
}
