package com.sb.msa.limits_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.msa.limits_service.configuration.LimitsConfiguration;
import com.sb.msa.limits_service.limits.Limits;

@RestController
public class LimitsController {
	@Autowired
	private LimitsConfiguration limitsConfiguration;
	
	@GetMapping("/limits")
	public Limits getLimits() {
		return new Limits(limitsConfiguration.getMinimum(), limitsConfiguration.getMaximum());
//		return new Limits(1, 1000);
	}
}