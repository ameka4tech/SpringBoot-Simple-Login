package com.springmvcboot.ajava;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ameya on 11/26/2017.
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String viewHome() {
        return "index";
    }
}
