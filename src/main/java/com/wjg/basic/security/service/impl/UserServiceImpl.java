/**
 * 
 */
package com.wjg.basic.security.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import com.wjg.basic.security.mapper.SysAuthorityMappper;
import com.wjg.basic.security.mapper.SysGroupMapper;
import com.wjg.basic.security.mapper.SysUserMapper;
import com.wjg.basic.security.po.SysAuthorityPO;
import com.wjg.basic.security.po.SysGroupPO;
import com.wjg.basic.security.po.SysUserPO;
import com.wjg.basic.security.service.IUserService;

/**
 * @author ghost
 * @version 创建时间：2016年8月29日 下午2:08:53 类说明 用户服务类
 */
@Service
public class UserServiceImpl implements IUserService {
	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	private SysUserMapper userMapper;
	@Autowired
	private SysAuthorityMappper authorityMapper;
	@Autowired
	private SysGroupMapper groupMapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wjg.basic.security.service.IUserService#getUserByUsername(java.lang
	 * .String)
	 */
	@Override
	public SysUserPO getUserByUsername(String username) {
		return userMapper.findUserByUsername(username);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wjg.basic.security.service.IUserService#getAuthoritiesByUsername(
	 * java.lang.String)
	 */
	@Override
	public Set<GrantedAuthority> getAuthoritiesByUsername(String username) {
		Set<GrantedAuthority> auths = new HashSet<GrantedAuthority>();
		List<SysGroupPO> groups = groupMapper.findGroupByUser(this
				.getUserByUsername(username));
		if (groups != null && groups.size() > 0) {
			List<SysAuthorityPO> authorities = authorityMapper.findAuthoritysByGroup(groups);
			for (SysAuthorityPO saPO : authorities) {
				auths.add(new SimpleGrantedAuthority(saPO.getAuthority()));
			}
		}
		return auths;
	}

}
