package com.example.demo1;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo1.dao.StudentMapper;
import com.example.demo1.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

@SpringBootTest
class Demo1ApplicationTests {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private StudentMapper studentMapper;


    @Test
    void contextLoads() {
      // LambdaQueryWrapper<Student> l = new  QueryWrapper<Student>().lambda().orderByDesc(Student::getName);
       //l.orderByDesc(Student::getName);
        //System.out.println(studentMapper.selectList(l));
        //studentMapper.selectById(1);
        Student student = studentMapper.selectById(1);
    }
    @Test
    void t1() throws IOException, ClassNotFoundException {
       //LettuceConnectionFactory lettuceConnectionFactory = (LettuceConnectionFactory) redisTemplate.getConnectionFactory();
       //redisTemplate.setConnectionFactory(lettuceConnectionFactory);
       //redisTemplate.opsForValue().set("xl:xx:tt","123");
       // redisTemplate.opsForSet().members("gameserv_oauth:uname_to_access:app:ljw@juwan.group");
      //  HashSet<String> hashSet = (HashSet<String>) redisTemplate.opsForSet().members("xl_set");
        //byte [] b= jdkSerializationRedisSerializer.serialize("789797987987987");
       // redisTemplate.boundSetOps("xl_set").add(new String(b,"utf-8"));
        //BeanUtils.copyProperties();
        //redisTemplate.opsForHash().
        System.out.println(123);
    }

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Runnable() {
            @Override
            public void run() {
                System.out.println(123456);
            }
        });
        int i= 0;
        while (i<3){
            new Thread(){
                @Override
                public void run() {
                    super.run();
                    try {
                        Thread.currentThread().sleep(2000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getId());
                    try {
                        cyclicBarrier.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
            i++;
        }
        System.out.println("123");
    }
}
