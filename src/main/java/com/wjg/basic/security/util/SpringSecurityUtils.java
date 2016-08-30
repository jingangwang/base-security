/**
 * 
 */
package com.wjg.basic.security.util;

import java.security.Principal;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

/** 
 * @author  ghost
 * @version 创建时间：2016年8月22日 下午4:54:21 
 * 类说明 		spring security 工具类
 */
public class SpringSecurityUtils {
	/**
	 * 获取当前的登录用户名
	 * @return
	 */
	public String getCurrentUsername() {
	      Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	      if (principal instanceof UserDetails) {
	         return ((UserDetails) principal).getUsername();
	      }
	      if (principal instanceof Principal) {
	         return ((Principal) principal).getName();
	      }
	      return String.valueOf(principal);
	   }
}


