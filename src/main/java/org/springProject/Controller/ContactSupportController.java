package org.springProject.Controller;

import org.springProject.DTO.CommunicationDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactSupportController {
    @GetMapping("/ContactSupport")
    public String Contact(@ModelAttribute("communicationDTO") CommunicationDTO communicationDTO){
        return "ContactSupport";
    }
    @GetMapping("/ShowContactSupportPage")
    public String ShowPage(){
        return "ShowContactSupportPage";
    }
}
