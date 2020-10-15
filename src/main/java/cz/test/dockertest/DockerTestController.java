package cz.test.dockertest;

import java.time.LocalDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerTestController {

  private static final Logger logger = LoggerFactory.getLogger(DockerTestController.class);

  @GetMapping("/test")
  public String test() {
    String message = "Test - current time: " + LocalDateTime.now();
    logger.info(message);
    return message;
  }

}