package com.atom.storev2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String HomeController() {
        return "index.html";
    }

    //private String getViewName(){
    //    return "index";
    //}
}
