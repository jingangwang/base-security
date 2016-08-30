/**
 * 
 */
package com.wjg.basic.security.service;

import java.util.Set;

import org.springframework.security.core.GrantedAuthority;

import com.wjg.basic.security.po.SysUserPO;

/**
 * @author ghost
 * @version 创建时间：2016年8月29日 下午2:05:52 类说明 用户service
 */
public interface IUserService {

	SysUserPO getUserByUsername(String username);

	Set<GrantedAuthority> getAuthoritiesByUsername(String username);
}
