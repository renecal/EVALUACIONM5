package com.prueba.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.prueba.interfaceService.Autoridad;
import com.prueba.repository.UserRepository;

@Service
public class UserDetailServiceImpl implements UserDetailsService{

	@Autowired
	UserRepository userRepository;

	@SuppressWarnings("unchecked")
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		com.prueba.entity.User appUser = 
				userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("No existe el Usuario"));

	  @SuppressWarnings("rawtypes")
	List grantList = new ArrayList();
	    for (Autoridad authority: appUser.getAutoridad()) {
	        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(authority.getAutoridad());
	            grantList.add(grantedAuthority);
	    }
			
	    UserDetails user = (UserDetails) new User(appUser.getUsername(), appUser.getPass(), grantList);
	         return user;
	    }
}
