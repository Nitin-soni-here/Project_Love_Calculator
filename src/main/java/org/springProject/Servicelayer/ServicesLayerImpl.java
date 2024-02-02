package org.springProject.Servicelayer;

import org.springProject.DAO.DAO_Method;
import org.springProject.DTO.Registration_Dto_Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesLayerImpl implements ServicesLayer {

    @Autowired
    DAO_Method daoMethod;

    @Override
    public void insertQuery(Registration_Dto_Config registrationDtoConfig) {
        daoMethod.insertQuery(registrationDtoConfig);
    }

    @Override
    public List<Registration_Dto_Config> Fetch() {
        return daoMethod.Fetch();
    }

    @Override
    public Object fetchingOne(String emailId) {
       return daoMethod.fetchingOne(emailId);
    }

    @Override
    public void Allclear() {
        daoMethod.Allclear();
    }


}

