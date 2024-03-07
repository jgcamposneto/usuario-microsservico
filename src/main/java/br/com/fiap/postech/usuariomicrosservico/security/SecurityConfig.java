package br.com.fiap.postech.usuariomicrosservico.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http)  throws Exception {
        return http.
                authorizeHttpRequests(
                        authorizeConfig -> {
                            authorizeConfig.requestMatchers("/usuarios/login").permitAll();
                            authorizeConfig.requestMatchers("/usuarios/register").permitAll();
                            authorizeConfig.requestMatchers("/usuarios/logout").permitAll();
                            authorizeConfig.anyRequest().authenticated();
                        }).httpBasic(Customizer.withDefaults())
                .build();
    }
}
