/**
 * 
 */
package com.wjg.basic.security.mapper;

import java.util.List;

import com.wjg.basic.security.po.SysGroupPO;
import com.wjg.basic.security.po.SysUserPO;

/**
 * @author ghost
 * @version 创建时间：2016年8月26日 下午3:00:05 类说明 用户组mapper
 */
public interface SysGroupMapper {
	List<SysGroupPO> findGroupByUser(SysUserPO user);
}
