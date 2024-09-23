package com.camunda.consulting.payment_camunda_7;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableProcessApplication("payment-camunda-7")
@ComponentScan
@Configuration
@EnableAutoConfiguration
public class CamundaApplication extends SpringBootServletInitializer {

  public static void main(String... args) {
    SpringApplication.run(CamundaApplication.class, args);
  }
  
  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
      return application.sources(applicationClass);
  }

  private static Class <CamundaApplication> applicationClass = CamundaApplication.class;

}
