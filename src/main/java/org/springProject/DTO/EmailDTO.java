package org.springProject.DTO;

import javax.validation.constraints.Email;

public class EmailDTO {
    @Email
    private String userEmail;

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
