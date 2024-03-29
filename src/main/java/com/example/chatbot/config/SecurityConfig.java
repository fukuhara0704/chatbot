package com.example.chatbot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;

    @Bean //パスワードのエンコード
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override //securityの設定をする
    protected void configure(HttpSecurity http) throws Exception {

        http
                .authorizeRequests()//ルール、アクセスポリシーの設定
                .antMatchers("/login").permitAll()//loginは認証なしでaccessできる
                .antMatchers("/register").permitAll()//registerは認証なしでaccessできる
                .anyRequest().authenticated()//↑以外のすべてのURLリクエストをloginしないと見れない
                .and()
                .formLogin()//ログインの設定
                .loginPage("/login")
                .defaultSuccessUrl("/top", true)//ログインが成功したら/にいく
                .and()
                .logout()//ログアウトの設定
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"));//logoutのURLを/logoutにする
    }

    @Override //認証方法の設定を行う
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth
                //userDetailsServiceを使って、認証を行う
                .userDetailsService(userDetailsService);
    }
}