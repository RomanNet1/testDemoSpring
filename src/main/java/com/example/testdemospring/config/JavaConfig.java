package com.example.testdemospring.config;

import com.example.testdemospring.system_profile.DevProfile;
import com.example.testdemospring.system_profile.ProductionProfile;
import com.example.testdemospring.system_profile.SystemProfile;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    @ConditionalOnProperty( value = "nrv.profile.dev",
                            havingValue = "true",
                            matchIfMissing = true
    )
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty( value = "nrv.profile.dev",
                            havingValue = "false"
    )
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
