package com.camunda.consulting.payment_camunda_7;

import org.camunda.bpm.BpmPlatform;
import org.camunda.bpm.ProcessEngineService;
import org.camunda.bpm.engine.HistoryService;
import org.camunda.bpm.engine.ManagementService;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.RepositoryService;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.engine.spring.application.SpringProcessApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.camunda.consulting.payment_camunda_7")
public class CamundaApplicationContext {
  @Bean
  public ProcessEngineService processEngineService() {
      return BpmPlatform.getProcessEngineService(); 
  }

  @Bean(destroyMethod = "") 
  public ProcessEngine processEngine() {
      return BpmPlatform.getDefaultProcessEngine();
  }

  @Bean
  public SpringProcessApplication processApplication() {
      return new SpringProcessApplication(); 
  }

  @Bean
  public RepositoryService repositoryService(ProcessEngine processEngine) {
      return processEngine.getRepositoryService(); 
  }

  @Bean
  public RuntimeService runtimeService(ProcessEngine processEngine) {
      return processEngine.getRuntimeService(); 
  }

  @Bean
  public TaskService taskService(ProcessEngine processEngine) {
      return processEngine.getTaskService(); 
  }

  @Bean
  public HistoryService historyService(ProcessEngine processEngine) {
      return processEngine.getHistoryService(); 
  }

  @Bean 
  public ManagementService managementService(ProcessEngine processEngine) {
      return processEngine.getManagementService(); 
  }
  
  /*@Bean
  public ServletListenerRegistrationBean<ServletContextListener> customListenerBean() {
      ServletListenerRegistrationBean<ServletContextListener> bean = new ServletListenerRegistrationBean<>();
      bean.setListener(new CustomListener());
      return bean;
  }
  
  @Bean
  public ServletRegistrationBean customServletBean() {
      ServletRegistrationBean bean = new ServletRegistrationBean(new CustomServlet(), "/servlet");
      return bean;
  }*/

}
