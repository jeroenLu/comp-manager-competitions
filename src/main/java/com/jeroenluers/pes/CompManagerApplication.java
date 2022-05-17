package com.jeroenluers.pes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class CompManagerApplication {

  public static void main(final String[] args) {
    SpringApplication.run(CompManagerApplication.class, args);
  }
}
