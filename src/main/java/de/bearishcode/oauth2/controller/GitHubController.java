package de.bearishcode.oauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/github")
public class GitHubController
{
	@GetMapping
	public String getInfo()
	{
		return "This information is secured!";
	}
}
