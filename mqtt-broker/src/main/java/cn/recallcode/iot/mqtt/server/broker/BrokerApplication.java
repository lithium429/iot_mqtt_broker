/**
 * Copyright (c) 2018, Mr.Wang (recallcode@aliyun.com) All rights reserved.
 */

package cn.recallcode.iot.mqtt.server.broker;

import cn.recallcode.iot.mqtt.server.broker.config.BrokerProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * 通过SpringBoot启动服务
 */
@SpringBootApplication(scanBasePackages = {"cn.recallcode.iot.mqtt.server"})
public class BrokerApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(BrokerApplication.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);
	}

	@Bean
	public BrokerProperties brokerProperties() {
		return new BrokerProperties();
	}

}
