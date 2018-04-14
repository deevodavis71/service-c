package org.example.consulkubedemo.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@RefreshScope
@Configuration
public class MyProps {

    @Value("${servicec:'dafault'}")
    private String servicec;

    public String getServicec() {
        return servicec;
    }

    public void setServicec(String servicec) {
        this.servicec = servicec;
    }
}
