package org.springProject.Controller;

import org.springProject.DTO.CommunicationDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactSupportController {
    @RequestMapping("/ContactSupport")
    public String Contact(@ModelAttribute("communicationDTO") CommunicationDTO communicationDTO){
        return "ContactSupport";
    }
    @RequestMapping("/ShowContactSupportPage")
    public String ShowPage(){
        return "ShowContactSupportPage";
    }
}
