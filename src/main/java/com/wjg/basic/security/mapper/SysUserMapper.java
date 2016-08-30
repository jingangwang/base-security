/**
 * 
 */
package com.wjg.basic.security.mapper;

import com.wjg.basic.security.po.SysUserPO;

/**
 * @author ghost
 * @version 创建时间：2016年8月25日 下午6:10:38 类说明 用户mapper
 */
public interface SysUserMapper {
	SysUserPO findUserByUsername(String username);
}
