package com.huarui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import zipkin.server.internal.EnableZipkinServer;


@SpringBootApplication
@EnableAutoConfiguration
@EnableZipkinServer
//@EnableConfigServer
//@EnableHystrixDashboard
@EnableEurekaClient
//@EnableTurbine
@EnableZuulProxy
public class Zipkin_App
{
	public static void main(String[] args)
	{


		SpringApplication.run(Zipkin_App.class, args);
	}
}
