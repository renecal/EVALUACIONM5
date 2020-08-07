package com.prueba.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
<<<<<<< Updated upstream:src/main/java/com/prueba/securityConfig/WebSecutiryConfig.java
public class WebSecutiryConfig extends WebSecurityConfigurerAdapter{
	 String[] resources = new String[]{
	            "/include/**","/css/**","/icons/**","/img/**","/js/**","/layer/**"
	    };
		
	    @Override
	    protected void configure(HttpSecurity http) throws Exception {
=======
public class webSecurityConfig extends WebSecurityConfigurerAdapter{

	String[] resources = new String[]{
            "/include/**","/css/**","/icons/**","/img/**","/js/**","/layer/**"
   };

	 @Override
	 protected void configure(HttpSecurity http) throws Exception {
>>>>>>> Stashed changes:src/main/java/com/prueba/security/webSecurityConfig.java
	        http
	            .authorizeRequests()
		        .antMatchers(resources).permitAll()  
		        .antMatchers("/","/login").permitAll()
		        .antMatchers("/listar*").access("hasRole('ADMIN')")
		        .antMatchers("/nuevo*").access("hasRole('ADMIN')")
		        .antMatchers("/panelGeneral*").access("hasRole('USER') or hasRole('ADMIN')")
	                .anyRequest().authenticated()
	                .and()
	            .formLogin()
	                .loginPage("/login")
	                .permitAll()
	                .defaultSuccessUrl("/panelGeneral")
	                .failureUrl("/login?error=true")
	                .usernameParameter("username")
	                .passwordParameter("password")
	                .and()
	            .logout()
	                .permitAll()
	                .logoutSuccessUrl("/login?logout");
	    }
	    BCryptPasswordEncoder bCryptPasswordEncoder;
	    
	    @Bean
	    public BCryptPasswordEncoder passwordEncoder() {
			bCryptPasswordEncoder = new BCryptPasswordEncoder(4);
	        return bCryptPasswordEncoder;
	    }
		
	    @Autowired
<<<<<<< Updated upstream:src/main/java/com/prueba/securityConfig/WebSecutiryConfig.java
	    UserDetailServiceImpl userDetailsService;
		
	    //Registra el service para usuarios y el encriptador de contrasena
=======
	    UserDetailsServiceImpl userDetailsService;
	
>>>>>>> Stashed changes:src/main/java/com/prueba/security/webSecurityConfig.java
	    @Autowired
	    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception { 
	        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());     
	    }
	}



