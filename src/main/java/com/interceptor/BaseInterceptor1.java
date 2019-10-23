package com.interceptor;

import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import com.service.*;
import com.entity.*;
import java.util.*;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.support.WebApplicationContextUtils;//用于拿到spring上下文的工具

/**
 * @program: boot
 * @description: 基本拦截器
 * @author: Means
 * @create: 2019-08-29 14:19
 **/

//基本拦截器，测试用
public class BaseInterceptor1 implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("-----------------进入controller");

        IDemoService ds = (IDemoService) (getBean("demoService",request.getServletContext()));

        System.out.println(" demoService = "+ds);

        return true;
    }

    private Object getBean(String name, ServletContext ctx) throws Exception{
        //在无法注入的情况下，如何获得 spring 上下文
        ApplicationContext ct = WebApplicationContextUtils.getRequiredWebApplicationContext(ctx);
        return ct.getBean(name);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("-----------------出controller");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("-----------------进入view");

    }
}
