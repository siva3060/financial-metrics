package project.financialmetrics.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class HelloController{

@GetMapping("/hello")
@ResponseBody
public String sayHello(){

	return "Hello World Developer !!!";
	//end of method sayHello
}
	//end of class HelloController
}
