package com.example.demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.vo.HelloRequestVO;

@SpringBootTest
public class HelloServiceTest {

    @Autowired
    private HelloService helloService;


    @Test
	void testHello() {
        final Integer repeatTimes = 3;
        HelloRequestVO helloRequestVO = new HelloRequestVO();
        helloRequestVO.setLanguage("chinese");
        helloRequestVO.setRepeatTimes(repeatTimes);

        String result = helloService.hello(helloRequestVO);
        String expect = """
            來自 Spring Boot 的問候！
            來自 Spring Boot 的問候！
            來自 Spring Boot 的問候！
            """;

        assert result.equals(expect);
	}
}
