/**
 * 
 */
package com.wjg.basic.security.po;

/**
 * @author ghost
 * @version 创建时间：2016年8月25日 下午6:06:25 
 * 类说明 用户组与权限的关系表
 */
public class SysGroupAuthorityPO {
	private Long id;
	private Long groupId;
	private Long authorityId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public Long getAuthorityId() {
		return authorityId;
	}

	public void setAuthorityId(Long authorityId) {
		this.authorityId = authorityId;
	}

}
