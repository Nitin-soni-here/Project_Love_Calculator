package org.springProject.DAO;

import org.springProject.DTO.Registration_Dto_Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Implement_DAO_Method implements DAO_Method {
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    @Override
    public void insertQuery(Registration_Dto_Config registrationDtoConfig) {
       String sql="INSERT INTO dataHere VALUE(?,?,?,?,?)";
        String sql1="INSERT INTO users VALUE(?,?,?)";
        String sql2="INSERT INTO authorities VALUE(?,?)";
        Object[] args={registrationDtoConfig.getUsername(),registrationDtoConfig.getPassword(),
               registrationDtoConfig.getEmailId(),registrationDtoConfig.getGender(),registrationDtoConfig.getCountry()};
       jdbcTemplate.update(sql,args);
        jdbcTemplate.update(sql1,registrationDtoConfig.getUsername(),registrationDtoConfig.getPassword(),1);
        jdbcTemplate.update(sql2,registrationDtoConfig.getUsername(),"USER");
    }

    @Override
    public List<Registration_Dto_Config> Fetch() {
        String sql="SELECT * FROM dataHere";
           List<Registration_Dto_Config> stu=jdbcTemplate.query(sql,new LoveRowMapper());
        //System.out.println(stu);
        return stu;
    }

    @Override
    public Registration_Dto_Config fetchingOne(String emailId) {
        String sql="SELECT * FROM dataHere WHERE emailId=?";
        Registration_Dto_Config EN= jdbcTemplate.queryForObject(sql,new LoveRowMapper(),emailId);
        System.out.println(EN);
        return EN;
    }

    @Override
    public void Allclear() {
        String sql="TRUNCATE TABLE authorities";
        String sql1="TRUNCATE TABLE dataHere";
        jdbcTemplate.update(sql);
        jdbcTemplate.update(sql1);
    }

}
