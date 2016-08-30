/**
 * 
 */
package com.wjg.basic.security.mapper;

import java.util.List;

import com.wjg.basic.security.po.SysAuthorityPO;
import com.wjg.basic.security.po.SysGroupPO;

/**
 * @author ghost
 * @version 创建时间：2016年8月26日 下午3:03:10 类说明 权限mapper
 */
public interface SysAuthorityMappper {
	List<SysAuthorityPO> findAuthoritysByGroup(List<SysGroupPO> groups);
}
