package com.xtk.xtkanalyst.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
//    @Override
/*    protected void configure(HttpSecurity http) throws Exception {
   *//* 下面这两行配置表示在内存中配置了两个用户
    auth.inMemoryAuthentication()
        .withUser("admin").roles("admin").password("$2a$10$/kdZb4/5TgUmYwiZM7FCg.QREFtvwjGH0BKqUBu2uCSm9ZVy/.y4W")
        .and()
        .withUser("user").roles("user").password("$2a$10$qLns.dMsL0zSh37GvdLun.Iux3VWZ4ylfWYMyJQYCUriaZgxAJBtK");

    }*//*
        http.authorizeRequests()//表示下面是认证的配置
                //访问 /index，需要具备 admin 这个角色
                //.antMatchers("/index").hasRole("admin")
                .anyRequest()//其它任何请求
                .authenticated()//都需要身份认证，登录之后就能访问
               .and().formLogin()
                *//*
                    //登录 成功+失败 的处理器
                    .successHandler(new AuthenticationSuccessHandler() {
                        @Override
                        public void onAuthenticationSuccess(HttpServletRequest req, HttpServletResponse resp, Authentication authentication) throws IOException, ServletException {
                            resp.setContentType("application/json;charset=utf-8");
                            PrintWriter out = resp.getWriter();
                            out.write("success");
                            out.flush();
                        }
                    })
                    .failureHandler(new AuthenticationFailureHandler() {
                        @Override
                        public void onAuthenticationFailure(HttpServletRequest req, HttpServletResponse resp, AuthenticationException exception) throws IOException, ServletException {
                            resp.setContentType("application/json;charset=utf-8");
                            PrintWriter out = resp.getWriter();
                            out.write("fail");
                            out.flush();
                        }
                    })
                    .permitAll()//和表单登录相关的接口统统都直接通过
                    *//*
                .and().logout()
                    .logoutUrl("/logout")
                    .logoutSuccessHandler(new LogoutSuccessHandler() {
                        @Override
                        public void onLogoutSuccess(HttpServletRequest req, HttpServletResponse resp, Authentication authentication) throws IOException, ServletException {
                            resp.setContentType("application/json;charset=utf-8");
                            PrintWriter out = resp.getWriter();
                            out.write("logout success");
                            out.flush();
                        }
                    })
                    .permitAll()
                .and().httpBasic()
                .and().csrf().disable();


    }*/

    // 临时禁用
    protected void configure(HttpSecurity http) throws Exception {
        http.headers().frameOptions().disable();
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/actuator/**").permitAll()
                .antMatchers("/eureka/**").permitAll()
                .anyRequest().permitAll()
//                .authenticated()
                .and().httpBasic();
    }


    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}