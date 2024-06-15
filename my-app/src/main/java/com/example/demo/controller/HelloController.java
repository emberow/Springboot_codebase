package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.HelloService;
import com.example.demo.vo.ApiResponse;
import com.example.demo.vo.HelloRequestVO;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/")
public class HelloController {

	@Autowired
	private HelloService helloService;

	@GetMapping("/echo")
	public ResponseEntity<ApiResponse<String>> echo(@RequestParam String input) {
		String data = helloService.echo(input);
		ApiResponse<String> response = new ApiResponse<>(200, "successed", data);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@PostMapping("/hello")
	public ResponseEntity<ApiResponse<String>> hello(@Valid @RequestBody HelloRequestVO helloRequestVO) {
		String data = helloService.hello(helloRequestVO);
		ApiResponse<String> response = new ApiResponse<>(200, "successed", data);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
