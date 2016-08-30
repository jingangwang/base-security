/**
 * 
 */
package com.wjg.basic.security.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.wjg.basic.security.po.SysUserPO;
import com.wjg.basic.security.service.IUserService;

/**
 * @author ghost
 * @version 创建时间：2016年8月24日 下午1:43:50 类说明
 */
@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(UserDetailsServiceImpl.class);
	@Autowired
	private IUserService userSerivce;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.security.core.userdetails.UserDetailsService#
	 * loadUserByUsername(java.lang.String)
	 */
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		SysUserPO userPO = userSerivce.getUserByUsername(username);
		if (userPO == null) {
			throw new UsernameNotFoundException("username:" + username
					+ " not found!");
		}
		userPO.setAuthorities(userSerivce.getAuthoritiesByUsername(username));
		return userPO;
	}

}
