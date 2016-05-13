
package com.lftechnology.library.service;

import java.util.List;

import javax.ejb.Singleton;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import com.lftechnology.library.dao.UserDAO;
import com.lftechnology.library.model.User;

@Transactional
@Singleton
public class UserServiceImpl implements UserDAO {

    @Inject
    private EntityManager entityManager;

    public List<User> findAll() {
        return this.entityManager.createQuery("Select user from User user where user.active=?", User.class).setParameter(
            1, true).getResultList();
    }

    public User findById(Long id) {
        return this.entityManager.find(User.class, id);
    }

    public User save(User object) {
        this.entityManager.persist(object);
        this.entityManager.flush();
        return object;
    }

    public void delete(Long id) {
        this.entityManager.remove(this.findById(id));
    }

}
