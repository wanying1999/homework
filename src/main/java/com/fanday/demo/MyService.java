package com.fanday.demo;

import com.fanday.ioc.annotation.Component;

@Component("myservice")
public class MyService {
    public void say(String s){System.out.println(s);}
}
