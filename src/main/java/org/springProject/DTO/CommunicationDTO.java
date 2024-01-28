package org.springProject.DTO;

import org.springProject.ContactSupport.Phone;

import javax.validation.constraints.Email;

public class CommunicationDTO {
    @Email
    private String emailId;
    private Phone phone;

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}
