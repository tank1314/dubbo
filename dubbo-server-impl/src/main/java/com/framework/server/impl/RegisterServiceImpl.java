package com.framework.server.impl;

import org.springframework.stereotype.Service;

import com.framework.baseservice.dubbo.server.api.RegisterService;

/**
 * 服务端实现
 * @author Administrator
 *
 */
@Service("registerService")
public class RegisterServiceImpl implements RegisterService {

	public String sayHello(String str) {
		return "hello :"+str;
	}

}
