package com.example.demo1.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

@TableName("score")
public class Score implements Serializable {

        private static final long serialVersionUID = 1L;
         @TableId(type = IdType.AUTO)
        private Integer sId;

        private String sName;

        private Float score;



    }
