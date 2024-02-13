package com.example.crmtim.configurations;

import com.example.crmtim.services.PersonDetailsService;
import lombok.AllArgsConstructor;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;


@EnableWebSecurity
@AllArgsConstructor
//аннотацию @Configuration можно не ставить?
public class SecurityConfig extends WebSecurityConfiguration {
    private final PersonDetailsService personDetailsService;
    protected void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder.userDetailsService(personDetailsService);
    }

}
