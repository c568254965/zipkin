package com.huarui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.ComponentScan;
import zipkin.server.internal.EnableZipkinServer;


@SpringBootApplication
@EnableAutoConfiguration
@EnableZipkinServer
@EnableConfigServer
public class Zipkin_App
{
	public static void main(String[] args)
	{


		SpringApplication.run(Zipkin_App.class, args);
	}
}
