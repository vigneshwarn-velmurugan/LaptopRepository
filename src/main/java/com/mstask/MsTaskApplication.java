package com.mstask;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsTaskApplication {
	static Logger log = Logger.getLogger(MsTaskApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(MsTaskApplication.class, args);
		PropertyConfigurator.configure("Laptop.properties");
		log.info("this is info");
		log.warn("this is warn");
		log.error("this is error");
		log.debug("this is debug");
		log.fatal("this is fatal");
	}

}
