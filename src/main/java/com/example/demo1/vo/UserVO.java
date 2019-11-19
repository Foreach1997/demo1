package com.example.demo1.vo;

import com.example.demo1.entity.Score;
import com.example.demo1.entity.Student;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Data
public class UserVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private  Integer id;

    private  String name;
}
