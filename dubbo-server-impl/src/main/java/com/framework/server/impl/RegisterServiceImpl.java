package com.framework.server.impl;

import org.springframework.stereotype.Service;

import com.framework.baseservice.dubbo.server.api.RegisterService;

/**
 * �����ʵ��
 * @author Administrator
 *
 */
@Service("registerService")
public class RegisterServiceImpl implements RegisterService {

	public String sayHello(String str) {
		return "hello :"+str;
	}

}
