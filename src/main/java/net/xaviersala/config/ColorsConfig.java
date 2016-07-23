package net.xaviersala.config;

import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ColorsConfig {
  @Bean
  public EmbeddedServletContainerCustomizer containerCustomizer(){
      return new Personalitzador();
  }
}
