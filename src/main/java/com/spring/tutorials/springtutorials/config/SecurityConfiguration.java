package com.spring.tutorials.springtutorials.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests((requests) -> { (requests.anyRequest()).permitAll();});
//        http.authorizeHttpRequests((requests) -> { (requests.anyRequest()).denyAll();});
//        http.authorizeHttpRequests((requests) -> { (requests.anyRequest()).authenticated();});
        http.authorizeHttpRequests((requests) -> { (requests)
                .requestMatchers("/myAccount", "myBalance", "myCards", "myLoans").authenticated()
                .requestMatchers("myContact", "myNotices").permitAll();});
        http.formLogin(Customizer.withDefaults());
        http.httpBasic(Customizer.withDefaults());
        return http.build();
    }
}
