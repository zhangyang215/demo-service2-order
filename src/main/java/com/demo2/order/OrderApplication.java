/* 
 * create by 2020年1月24日 下午12:51:32
 */
package com.demo2.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author fangang
 */
@SpringBootApplication
@Configuration
@ComponentScan(basePackages={"com.demo2"})
@ImportResource(locations={"classpath*:applicationContext-*.xml"})
@MapperScan("com.demo2.support.dao")
@EnableEurekaClient
public class OrderApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
		System.out.println(".....................................");
		System.out.println("....The Order Application started....");
		System.out.println(".....................................");
	}

}
