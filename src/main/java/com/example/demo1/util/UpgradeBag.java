package com.example.demo1.util;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo1.entity.Student;
import com.example.demo1.service.StudentService;
import com.example.demo1.vo.UserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpgradeBag extends AbstractEquity   {

    private StudentService studentService;

    private List<Integer> ids;

    private List<UserVO> userVOs;

    private List<Student> students;

    public UpgradeBag(List<UserVO> userVOs,StudentService studentService){
        this.userVOs = userVOs;
        this.studentService = studentService;
    }

    @Override
    public void del() {
        studentService.remove(new QueryWrapper<Student>().notIn("id",this.ids));
    }

    @Override
    public void saveOrUpdate() {
        studentService.saveOrUpdateBatch(students);
    }

    @Override
    public void beanMatch(List<UserVO> userVOs) {
        List<Student> students = new ArrayList<Student>();
        Student student = new Student();
        for (UserVO userVO1:userVOs){
            BeanUtils.copyProperties(userVO1,student);
            students.add(student);
        }
        this.ids = userVOs.stream().map(UserVO::getId).collect(Collectors.toList());
        this.students = students;
    }

    public static void t1() throws Exception {
    }

    public static void main(String[] args) throws Exception {
        t1();
    }
    @Override
    public String finish(){
     beanMatch(userVOs);
     del();
     saveOrUpdate();
     return "success";
    }

}
