package net.xaviersala.config;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.ErrorPage;
import org.springframework.http.HttpStatus;

public class Personalitzador implements EmbeddedServletContainerCustomizer {

  @Override
  public void customize(ConfigurableEmbeddedServletContainer container) {

    ErrorPage error400 = new ErrorPage(HttpStatus.BAD_REQUEST, "/400.html");
    ErrorPage error404 = new ErrorPage(HttpStatus.NOT_FOUND, "/404.html");
    ErrorPage error500 = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/500.html");
    container.addErrorPages(error400, error404, error500);
  }

}
