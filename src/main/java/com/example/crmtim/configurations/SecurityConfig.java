package com.example.crmtim.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;



@Configuration
public class SecurityConfig{
    @Bean
    public PasswordEncoder getPasswordEncode(){
        return NoOpPasswordEncoder.getInstance();
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.csrf().disable()
                .authorizeHttpRequests()
                .requestMatchers("/authentification","/error","/registration").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin().loginPage("/authentification")
                .loginProcessingUrl("/process_login")
                .defaultSuccessUrl("/index",true)
                .failureUrl("/authentification?error");
        return http.build();
    }



}
