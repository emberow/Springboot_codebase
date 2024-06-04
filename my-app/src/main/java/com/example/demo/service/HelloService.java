package com.example.demo.service;

import com.example.demo.requestVO.HelloRequestVO;

public interface HelloService {

    /**
     * Return greeting words
     *
     * @param response /
     */
    String echo(String input);

    String hello(HelloRequestVO helloRequestVO);
}

