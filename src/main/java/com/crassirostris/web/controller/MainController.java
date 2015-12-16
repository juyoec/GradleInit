package com.crassirostris.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by crassirostris on 2015. 12. 17..
 */
@Controller
public class MainController {
    @RequestMapping("/")
    public String base() {
        return "hello";
    }
}
