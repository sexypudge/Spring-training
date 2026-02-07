package com.dev4vn.first_springboot;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "error-config")
public class ErrorConfigProperties {
    private int notFoundCode;
    private String notFoundMsg;
    private int serverErrorCode;
    private String serverErrorMsg;
}