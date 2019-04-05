package com.etrgovija.lab.repository.jpa;

import com.etrgovija.lab.model.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @Override
    public List<User> findAll();

    @Override
    public List<User> findAll(Sort sort);

}
