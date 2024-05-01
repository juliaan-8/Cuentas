package com.example.Cuentas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateCongif {
    @Bean("clienteRest")
    public RestTemplate registrarRestTemplate()
    {
        return new RestTemplate();
    }
}