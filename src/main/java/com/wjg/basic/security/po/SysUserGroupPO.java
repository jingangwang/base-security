/**
 * 
 */
package com.wjg.basic.security.po;

/**
 * @author ghost
 * @version 创建时间：2016年8月25日 下午6:03:04 
 * 类说明 用于与用户组关系表
 */
public class SysUserGroupPO {
	private Long id;
	private Long userId;
	private Long groupId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}
}
