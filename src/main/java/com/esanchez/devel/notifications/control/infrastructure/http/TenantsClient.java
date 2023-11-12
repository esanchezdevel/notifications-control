package com.esanchez.devel.notifications.control.infrastructure.http;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;

import com.esanchez.devel.notifications.control.infrastructure.persistence.MemoryObjects;

@FeignClient(name = "tenants-client", configuration = TenantsClient.Configuration.class)
public interface TenantsClient {

    @org.springframework.context.annotation.Configuration
    class Configuration {
        @Bean
        public String tenantsUrl() {
            return MemoryObjects.getSessionSystem().getUrl() + "/admin/v2/tenants";
        }
    }
    
    //TODO the request
    @GetMapping("/ruta-del-endpoint")
    String obtenerDatos();
}
