package org.pipecrafts.oauth2bootstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class Oauth2BootStartApplication {

  public static void main(String[] args) {
    SpringApplication.run(Oauth2BootStartApplication.class, args);
  }

}
