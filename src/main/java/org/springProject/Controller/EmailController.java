package org.springProject.Controller;

import org.springProject.DTO.EmailDTO;
import org.springProject.DTO.Match_DTO_Config;
import org.springProject.Servicelayer.EmailServicesLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.validation.Valid;
import java.util.logging.Logger;

@Controller
public class EmailController {
    Logger logger=Logger.getLogger(EmailController.class.getName());
    @Autowired
    private EmailServicesLayer emailServicesLayer;
    @GetMapping("/Email")
    public String email(@ModelAttribute("emailDTO") EmailDTO emailDTO){
        return "EmailPage";
    }

    @GetMapping("/ShowEmailPage")
    public String ShowEmailPage( @SessionAttribute("matchDtoConfig") Match_DTO_Config matchDtoConfig,
                                @Valid @ModelAttribute("emailDTO") EmailDTO emailDTO, BindingResult result){
        if(result.hasErrors()){
            return "EmailPage";
        }
        try {

            emailServicesLayer.SendEmail(matchDtoConfig.getUserName(), emailDTO.getUserEmail(), matchDtoConfig.getAppResult());
        }
        catch (Exception e){
            System.out.println(e);
        }
        return "Show-Email-Page";
    }
}
