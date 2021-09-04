package com.koscom.springboot.web;

import com.koscom.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // (1)
public class HelloController {

    @GetMapping("/hello") // (2)
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, // (1)
                                     @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }
}
