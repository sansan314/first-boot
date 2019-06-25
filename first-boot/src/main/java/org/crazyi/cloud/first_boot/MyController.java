package org.crazyi.cloud.first_boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	@GetMapping("/Hello")
	@ResponseBody
	public String hello() {
		
		
		return "hello Tom";
	}

}
