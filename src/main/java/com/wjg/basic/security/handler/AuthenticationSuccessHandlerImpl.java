/**
 * 
 */
package com.wjg.basic.security.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

/** 
 * @author  ghost
 * @version 创建时间：2016年8月22日 下午2:08:02 
 * 类说明 		授权成功处理类
 * 			配置了此类之后，security配置文件的default-target-url属性失效
 */
public class AuthenticationSuccessHandlerImpl implements
		AuthenticationSuccessHandler {

	/* (non-Javadoc)
	 * @see org.springframework.security.web.authentication.AuthenticationSuccessHandler#onAuthenticationSuccess(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, org.springframework.security.core.Authentication)
	 */
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {
		//认证成功处理逻辑
		//...
		response.sendRedirect(request.getContextPath());
	}

}


