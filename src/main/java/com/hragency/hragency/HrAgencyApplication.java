package com.hragency.hragency;

import com.hragency.hragency.dao.Dao;
import com.hragency.hragency.entity.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HrAgencyApplication {
    @Autowired
    private static Dao dao;
    public static void main(String[] args) {
        SpringApplication.run(HrAgencyApplication.class, args);
        dao.saveUser(new User("login","password","user"));
    }

}
