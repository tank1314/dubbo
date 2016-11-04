package com.framework.baseservice.dubbo.customer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.framework.baseservice.dubbo.server.api.RegisterService;

public class DemoCustomerService {
	
	public static void main(String[] args) {
		//测试常规服务
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:/spring/*.xml");
        context.start();
        System.out.println("客户端启动成功!");
        RegisterService registerService = (RegisterService) context.getBean("registerService");
        String str = registerService.sayHello("tankun") ;
        System.out.println(str);
	}
}
