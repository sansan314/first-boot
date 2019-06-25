package org.crazyit.cloud;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	@Autowired
	private ApplicationContext ctx;
	
	@GetMapping("/prop")
	@ResponseBody
	public String getName() {
		return ctx.getEnvironment().getProperty("test.user.name");
		
	}

}
