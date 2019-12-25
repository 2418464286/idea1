package com.hp.config;

import com.hp.interceptor.LoginInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.xml.ws.WebEndpoint;

public class MvcConfig implements WebMvcConfigurer{
    public LoginInterceptor getLongInterceptor(){
        return  new LoginInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       registry.addInterceptor(getLongInterceptor()).addPathPatterns("/**");
    }
}
