package com.pig4cloud.pig.admin.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
        String[] permitUrls = new String[]{
                "/v2/api-docs",
                "/swagger**"
        };


        http.csrf().disable()
                .exceptionHandling()
                .and()
                .authorizeRequests()
                .mvcMatchers(permitUrls).permitAll()
                .anyRequest().authenticated()
                .and()
                .httpBasic();

    }
}
