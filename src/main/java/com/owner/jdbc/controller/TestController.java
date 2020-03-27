package com.owner.jdbc.controller;

import com.owner.jdbc.entity.Student;
import com.owner.jdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
public class TestController {

     @Autowired
     private UserService userService;

     private final  static  int[] array = {1,2,3,4,5,6};

     @Autowired
    JdbcTemplate jdbcTemplate;
     @ResponseBody
     @RequestMapping("/getA01")
     public List<Map<String, Object>> getA01(){


         return  jdbcTemplate.queryForList("select * from a01");

     }

     public static void getStudent(){

       Student[] st =  Student.getValue();

         for (int i = 0; i <st.length ; ++i) {
             System.out.println(st[i].getAge());
             System.out.println(st[i].getDesc());
         }

     }

    public static void main(String[] args) {
//        array[3] = 100;
//
//
//        for(int i=0; i<array.length;i++){
//            System.out.println(array[i]+"\\s");
//
//        }
//        getStudent();

        List list = new ArrayList();
        Map  m  = new HashMap();
        m.put("1",1);
        m.put("2",2);
        Map  m1  = new HashMap();
        m1.put("1",1);
        m1.put("2",2);

        list.add(m);
        list.add(m1);

        Set set = new HashSet(list);
        System.out.println(list.size());
        System.out.println(set.size());
    }

    public static void get2(Integer a){

        a= a*2;

       String c = "123";


    }



}
