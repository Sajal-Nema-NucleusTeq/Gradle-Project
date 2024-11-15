package com.gradle.project;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Component
@Configuration
public class AppConfig {
    @Value("${spring.application.name}")
    private String appName;
    
    @Value("${liquibase.database}")
    private String liquibasedb;
    
    @Value("${spring.datasource.url}")
    private String db_url;
    
    @Value("${spring.datasource.username}")
    private String db_username;
    
    @Value("${spring.datasource.password}")
    private String db_password;

    // @Value("${cloud.provider}")
    // private String cloud_platform;
     
    @Bean
    public AppConfig printProperties() {
        System.out.println("Application Name: " + appName);
        System.out.println("Database Value: " + liquibasedb);
        System.out.println("Database URL: " + db_url);
        System.out.println("Database Username: " + db_username);
        System.out.println("Database Password: " + db_password);
        System.out.println(System.getenv("CLOUD_PLATFORM"));

        // System.out.println("Cloud Platform: " + cloud_platform);

        return new AppConfig();
    }
}