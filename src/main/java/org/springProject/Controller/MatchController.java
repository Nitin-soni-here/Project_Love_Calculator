package org.springProject.Controller;

import org.springProject.DTO.Match_DTO_Config;
import org.springProject.LogicDesign.LOveCalculatorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;
import java.security.Principal;

@Controller
@SessionAttributes("matchDtoConfig")
public class MatchController {
    @Autowired
    private LOveCalculatorServices lOveCalculatorServices;
    @GetMapping("/")
    public String Login_page(Principal principal,Model model){
        String UserName=principal.getName();
        model.addAttribute("username",UserName.toUpperCase());
        model.addAttribute("matchDtoConfig" ,new Match_DTO_Config());
        return "LoginPage";
    }
    @GetMapping("/second")
    public String Show_HomePage(@Valid @ModelAttribute("matchDtoConfig") Match_DTO_Config matchDtoConfig,
                                BindingResult results) {
        if(results.hasErrors()){
            System.out.println("run");
            return "LoginPage";
        }
       String appResult= lOveCalculatorServices.calculateLove(matchDtoConfig.getUserName(),matchDtoConfig.getCrushName());
        matchDtoConfig.setAppResult(appResult);
        return "ShowLoginPage";
    }

}
