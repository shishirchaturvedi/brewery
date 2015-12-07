package io.spring.cloud.samples.brewery.acceptance

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.context.annotation.Configuration

@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
class TestConfiguration {
}