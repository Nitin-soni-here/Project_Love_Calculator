package org.springProject.DAO;

import org.springProject.DTO.Registration_Dto_Config;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LoveRowMapper implements RowMapper<Registration_Dto_Config> {
    @Override
    public Registration_Dto_Config mapRow(ResultSet resultSet, int i) throws SQLException {
        Registration_Dto_Config entitiesDao=new Registration_Dto_Config();
        entitiesDao.setEmailId(resultSet.getString("emailId"));
        return entitiesDao;
    }
}
