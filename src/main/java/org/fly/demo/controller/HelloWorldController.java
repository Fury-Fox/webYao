package org.fly.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class HelloWorldController {

    @RequestMapping("/helloWorld")
    public String helloworld() {
        return "helloWorld!";
    }


}
