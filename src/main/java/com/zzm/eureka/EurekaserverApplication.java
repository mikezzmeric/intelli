package com.zzm.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaserverApplication 
{
	public static void main(String[] args) {
	    System.out.println("haha");
        SpringApplication.run(EurekaserverApplication.class, args);
    }
}
