package org.springProject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginPage {
    @GetMapping("/FrontLoginPage")
    public String LoginPage1(){
        return "FrontLoginPage";
    }
}

