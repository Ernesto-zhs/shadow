package com.shadow.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/index")
public class IndexController {

    @RequestMapping(value = "/get")
    public String get() {
        return "Hello World!";
    }

}
