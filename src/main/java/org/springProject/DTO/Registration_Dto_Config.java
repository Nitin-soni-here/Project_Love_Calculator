package org.springProject.DTO;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Registration_Dto_Config {
    @NotBlank(message = "Not Be Blank")
    @Size(min = 3,max = 15,message = "Your Size Should Be 3 to 15")
    private String username;
    @Email
    private String emailId;
    @NotEmpty
    private String password;
    @NotEmpty
    private String country;
    @NotEmpty
    private String gender;

    private CommunicationDTO communicationDTO;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public CommunicationDTO getCommunicationDTO() {
        return communicationDTO;
    }

    public void setCommunicationDTO(CommunicationDTO communicationDTO) {
        this.communicationDTO = communicationDTO;

    }

    @Override
    public String toString() {
        return "Registration_Dto_Config{" +
                "username='" + username + '\'' +
                ", emailId='" + emailId + '\'' +
                ", password='" + password + '\'' +
                ", country='" + country + '\'' +
                ", gender='" + gender + '\'' +
                ", communicationDTO=" + communicationDTO +
                '}';
    }
}
