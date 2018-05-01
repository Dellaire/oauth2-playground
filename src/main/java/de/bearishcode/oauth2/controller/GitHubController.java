package de.bearishcode.oauth2.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitHubController
{
	@GetMapping("/user")
	public Principal getInfo(Principal principal)
	{
		return principal;
	}
}
