package com.tasks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskController {

	@GetMapping("/tasks")
	public String viewTask() {
		return "/tasks/TopPage";
	}
}
