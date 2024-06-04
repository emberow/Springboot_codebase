package com.example.demo.service;

import com.example.demo.requestVO.HelloRequestVO;

public interface HelloService {

    String echo(String input);

    String hello(HelloRequestVO helloRequestVO);
}

