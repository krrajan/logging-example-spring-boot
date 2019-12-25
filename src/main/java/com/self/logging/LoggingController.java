package com.self.logging;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;

@RestController
@RequestMapping(value = "/api")
public class LoggingController {

	private static final Logger logger = LoggerFactory.getLogger(LoggingController.class);

	private static final String IND="IND";
	@GetMapping("/Hello")
	public String getMessage() {
		logger.info("This is Info!!!!!!!!! {}" + IND);
		logger.debug("This is Debug!!!!!!!!!{}" + IND);
		logger.trace("This is trace!!!!!!!!!{}" + IND);
		logger.warn("This is warn!!!!!!!!!{}" + IND);
		logger.error("This is error!!!!!!!!!{}" + IND);
		
		return "Hello India!!!!!!!"; 
	}
}
