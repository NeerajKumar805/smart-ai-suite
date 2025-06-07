//GeminiController.java
package com.email.generator.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ai")
@CrossOrigin
public class GeminiController {

	@Autowired
	GeminiService geminiService;

	@PostMapping("/email")
	public String generateEmail(@RequestBody Map<String, String> req) {
		String prompt = req.get("prompt");
		return geminiService.generateContent("Write professional email with simple text (not bold): " + prompt);
	}

	@PostMapping("/blog")
	public String generateBlog(@RequestBody Map<String, String> req) {
		String prompt = req.get("prompt");
		return geminiService.generateContent("Write a detailed blog post on with simple text (not bold): " + prompt);
	}

	@PostMapping("/resume")
	public String enhanceResume(@RequestBody Map<String, String> req) {
		String prompt = req.get("prompt");
		return geminiService.generateContent("Enhance this resume text with simple text (not bold): " + prompt);
	}

	@PostMapping("/ad-copy")
	public String generateAdCopy(@RequestBody Map<String, String> req) {
		String prompt = req.get("prompt");
		return geminiService.generateContent("Create catchy ad copy for with simple text (not bold): " + prompt);
	}
	
	@PostMapping("/code")
	public String generateCode(@RequestBody Map<String, String> req) {
		String prompt = req.get("prompt");
		return geminiService.generateContent("write a code to perform the task for the prompt with a consise explanation: " + prompt);
	}
}
