//GeminiService.java
package com.email.generator.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@Service
public class GeminiService {

	@Value("${gemini.api.key}")
	private String apiKey;

	public String generateContent(String prompt) {
		String url = "https://generativelanguage.googleapis.com/v1beta/models/gemini-2.0-flash:generateContent?key="
				+ apiKey;

		RestTemplate restTemplate = new RestTemplate();

		Map<String, Object> requestBody = Map.of("contents", List.of(Map.of("parts", List.of(Map.of("text", prompt)))));

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> request = new HttpEntity<>(new Gson().toJson(requestBody), headers);
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, request, String.class);

		JsonObject json = JsonParser.parseString(response.getBody()).getAsJsonObject();
		String text = json.getAsJsonArray("candidates").get(0).getAsJsonObject().getAsJsonObject("content")
				.getAsJsonArray("parts").get(0).getAsJsonObject().get("text").getAsString();

		return text;
	}
}
