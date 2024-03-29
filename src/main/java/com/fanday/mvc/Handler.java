package com.fanday.mvc;

import java.lang.reflect.Method;
import java.util.regex.Pattern;

public class Handler {

    //调用对应的具体controller对象
    private Object controller;
    //和url匹配的方法
    private Method method;
    //对应RequestMapping的url正则
    private Pattern pattern;

    public Handler(Object controller, Method method, Pattern pattern) {
        this.controller = controller;
        this.method = method;
        this.pattern = pattern;
    }

    public Object getController() {
        return controller;
    }

    public void setController(Object controller) {
        this.controller = controller;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public Pattern getPattern() {
        return pattern;
    }

    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }
}
