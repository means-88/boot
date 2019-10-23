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
 * @description:基本拦截器
 * @author: Means
 * @create: 2019-09-23 16:43
 **/

public class BaseInterceptor {

    protected Object getBean(ServletContext ctx, String beanName) {
        ApplicationContext ac = WebApplicationContextUtils.getRequiredWebApplicationContext(ctx);

        Object obj = ac.getBean(beanName);

        return obj;

    }
}

