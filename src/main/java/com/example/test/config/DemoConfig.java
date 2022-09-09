package com.example.test.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class DemoConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册TokenInterceptor拦截器
        InterceptorRegistration registration = registry.addInterceptor(new DemoInterceptor());

        registration.addPathPatterns("/demo/**"); //所有路径都被拦截
        registration.excludePathPatterns(    //添加不拦截路径
                "/client/login",                    //登录路径
                "/**/*.html",                //html静态资源
                "/**/*.js",                  //js静态资源
                "/**/*.css",                  //css静态资源
                "/swagger-ui.html/**", "/doc.html/**","/swagger-resources"
        );

   //      InterceptorRegistration registration1 = registry.addInterceptor(new AdminInterceptor());
   //     registration1.addPathPatterns("/admin/**"); //所有路径都被拦截
   //     registration1.excludePathPatterns(    //添加不拦截路径
   //             "/admin/login",                    //登录路径
    //            "/**/*.html",                //html静态资源
    //            "/**/*.js",                  //js静态资源
     //           "/**/*.css",                  //css静态资源
      //          "/swagger-ui.html/**", "/doc.html/**","/swagger-resources"
      //  );
    }


}
