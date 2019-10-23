package com.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import com.interceptor.*;
/**
 * @program: boot
 * @description: 配置拦截器
 * @author: Means
 * @create: 2019-08-29 14:15
 **/

@Configuration //配置 让spring的工程能识别这个拦截器
public class MyConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        /**
         * /index: 只拦截index
         * 	/page/*:只拦截page路径下的
         * 	/*: 拦截 / 根路径下的所有
         * /**：拦截 所有
         */
        //加拦截器
        //registry.addInterceptor(new BaseInterceptor1()).addPathPatterns("/test");
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/*");
        registry.addInterceptor(new TokenInterceptor()).addPathPatterns("/*");
    }
}
