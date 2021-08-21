package com.hragency.hragency.dao;

import com.hragency.hragency.entity.User;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class Dao {

    @Autowired
    private EntityManager entityManager;

    public List<User> getAllUsers(){
        Session session = entityManager.unwrap(Session.class);
        Query query=session.createQuery("from users",
                User.class);
        session.close();
        return query.getResultList();
    }

    public void saveUser(User user){
        Session session = entityManager.unwrap(Session.class);
        session.save(user);
        session.close();
    }
}
