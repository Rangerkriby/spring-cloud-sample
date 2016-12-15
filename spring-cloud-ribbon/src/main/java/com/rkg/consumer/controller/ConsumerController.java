package com.rkg.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rkg.consumer.service.BizService;

@RestController
public class ConsumerController {
	@Autowired
	BizService bizService;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add() {
		return bizService.addService();
	}
}