/**
 * 
 */
package com.wjg.basic.security.po;

/**
 * @author ghost
 * @version 创建时间：2016年8月25日 下午5:02:26 
 * 类说明 用户组PO
 */
public class SysGroupPO {
	private Long groupId;
	private String groupName;
	private String groupDesc;
	private boolean enabled;

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupDesc() {
		return groupDesc;
	}

	public void setGroupDesc(String groupDesc) {
		this.groupDesc = groupDesc;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}
