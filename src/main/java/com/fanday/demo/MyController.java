package com.fanday.demo;
import com.fanday.ioc.annotation.Autowire;
import com.fanday.ioc.annotation.Controller;
import com.fanday.ioc.annotation.RequestMapping;
import com.fanday.ioc.annotation.RequestParam;
import com.fanday.ioc.support.AnnotationApplicationContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class MyController {

    @Autowire("myservice")
    private MyService service;

    public void test(){
        service.say("hello world");
    }

    public static void main(String[] args){
        AnnotationApplicationContext context = new AnnotationApplicationContext("applicationContext.properties");
        MyController controllor = context.getBean("com.fanday.demo.MyController", MyController.class);
        controllor.test();
    }

}
