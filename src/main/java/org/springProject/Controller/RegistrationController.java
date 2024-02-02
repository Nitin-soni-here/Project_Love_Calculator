package org.springProject.Controller;

import org.springProject.DTO.Registration_Dto_Config;
import org.springProject.Servicelayer.ServicesLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class RegistrationController {
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    ServicesLayer servicesLayer;
    @GetMapping("/Registration")
    public String FormRegistration(@ModelAttribute("registrationDtoConfig") Registration_Dto_Config registrationDtoConfig){
        return "registration";
    }
    @PostMapping("/SuccessFull")
    public String SuccessFullRegistration(@Valid @ModelAttribute("registrationDtoConfig")
                                              Registration_Dto_Config registrationDtoConfig,BindingResult result){
        if(result.hasErrors()){
            return "registration";
        }
        String setEncoder=passwordEncoder.encode(registrationDtoConfig.getPassword());
        registrationDtoConfig.setPassword(setEncoder);
        System.out.println(setEncoder);

        servicesLayer.insertQuery(registrationDtoConfig);
        return "redirect:/FrontLoginPage?login";
    }

}
