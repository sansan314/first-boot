package org.crazyi.cloud.first_boot;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	
//	@RequestMapping(value="/person/{id}",method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
//	public Person getPerson(@PathVariable Integer id) {
//		Person p = new Person();
//		p.setId(id);
//		p.setName("angus");
//		p.setAge(30);
//		return p;
//		
//	}
	
	@RequestMapping(value="/person2/{id}",method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String,Object> getPerson2(@PathVariable Integer id) {
		Person p = new Person();
		p.setId(id);
		p.setName("angus");
		p.setAge(30);
		Map<String,Object> b = new HashMap<String,Object>();
		b.put("a", "20");
		return b;
		
	}

}
