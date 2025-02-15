package com.Devops.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/devops")
public class DevopsController {
@GetMapping(value="/get")
public String Get() {
	return "Hi";
}
}
