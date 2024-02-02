package org.springProject.Servicelayer;

import org.springProject.DTO.Registration_Dto_Config;

import java.util.List;

public interface ServicesLayer {
    void insertQuery(Registration_Dto_Config registrationDtoConfig);
    List<Registration_Dto_Config> Fetch();
    Object fetchingOne(String emailId);
    void Allclear();
}
