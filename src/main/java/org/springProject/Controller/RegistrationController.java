package org.springProject.Controller;

import org.springProject.DTO.Registration_Dto_Config;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class RegistrationController {
    @RequestMapping("/Registration")
    public String Formregistration(@ModelAttribute("registrationDtoConfig") Registration_Dto_Config registrationDtoConfig){
        return "registration";
    }
    @RequestMapping("/successfull")
    public String Successfullregistration(@Valid @ModelAttribute("registrationDtoConfig")
                                              Registration_Dto_Config registrationDtoConfig, BindingResult result){
        if(result.hasErrors()){
            return "registration";
        }
        return "SuccessfullyRegistration";
    }

}
