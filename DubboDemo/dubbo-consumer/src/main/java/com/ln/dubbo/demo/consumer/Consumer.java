package com.ln.dubbo.demo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ln.dubbo.demo.DemoService;

public class Consumer {
	
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.err.println("consumer start");
        DemoService demoService = context.getBean(DemoService.class);
        System.err.println("consumer");
        System.out.println(demoService.getPermissions(1L));
    }

}
