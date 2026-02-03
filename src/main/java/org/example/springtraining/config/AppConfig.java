package org.example.springtraining.config;

import org.example.springtraining.domain.MySqlConnector;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // Lấy giá trị từ file application.properties
    @Value("${loda.mysql.url}")
    private String mysqlUrl;

    @Bean
    public MySqlConnector mysqlConnector() {
        MySqlConnector connector = new MySqlConnector();
        // Gán giá trị lấy từ file cấu hình vào Bean
        connector.setUrl(mysqlUrl);
        return connector;
    }
}