package com.martinmunene.springbeerapp.config;

import lombok.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;


/**
 * @author Martin Munene
 */
@Configuration
public class SpringSecConfig {
//    @Value("${jwksUri}")
//    private String jwksUri;
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
                .anyRequest().authenticated()
                .and().oauth2ResourceServer().jwt();


//        http.oauth2ResourceServer( server -> server.jwt(jwtConfigurer -> jwtConfigurer.jwkSetUri(jwksUri)));
//
//        http.oauth2ResourceServer( server -> server.jwt(jwtConfigurer -> jwtConfigurer.decoder( myDecoder )));
//
//        http.authorizeHttpRequests(auth -> auth.anyRequest().authenticated());

        return http.build();
    }


}
