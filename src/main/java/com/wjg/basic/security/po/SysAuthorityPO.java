/**
 * 
 */
package com.wjg.basic.security.po;

/** 
 * @author  ghost
 * @version 创建时间：2016年8月25日 下午5:19:32 
 * 类说明 		权限PO
 */
public class SysAuthorityPO {
	private Long authorityId;
	private String authority;
	private String authorityDesc;
	private boolean enabled;
	public Long getAuthorityId() {
		return authorityId;
	}
	public void setAuthorityId(Long authorityId) {
		this.authorityId = authorityId;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	public String getAuthorityDesc() {
		return authorityDesc;
	}
	public void setAuthorityDesc(String authorityDesc) {
		this.authorityDesc = authorityDesc;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}


