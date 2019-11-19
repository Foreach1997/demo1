package com.example.demo1.controller;

import com.example.demo1.entity.Student;
import com.example.demo1.service.impl.StudentServiceImpl;
import com.example.demo1.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private StudentServiceImpl studentService;

    @GetMapping("/t1")
    public Object t1(@Valid UserVO studentVO, BindingResult bindingResult){

        return "success";
    }

    @PostMapping("/t2")
    public Object t2(@RequestBody List<Student> students){
        studentService.saveOrUpdateBatch(students);
        //studentService.save();
        return "success";
    }

}
