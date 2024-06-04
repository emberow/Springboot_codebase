package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.requestVO.HelloRequestVO;
import com.example.demo.service.HelloService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/")
public class HelloController {

	@Autowired
	private HelloService helloService;

	/**
	 * return user input
	 * 
     * @param input
	 * @return input
     */
	@GetMapping("/echo")
	public String echo(@RequestParam String input) {
		return helloService.echo(input);
	}

	/**
	 * return chinese or english greeting
	 * 
     * @param language
	 * @param repeaTimes
	 * @return greeting words
     */
	@PostMapping("/hello")
	public String hello(@Valid @RequestBody HelloRequestVO helloRequestVO) {
		return helloService.hello(helloRequestVO);
	}

}