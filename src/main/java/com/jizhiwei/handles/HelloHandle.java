package com.jizhiwei.handles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloHandle {

	@RequestMapping("/hellow")
	public String sayHello() {
		return "hello";
	}
}
