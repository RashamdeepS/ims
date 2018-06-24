package com.parvs.management.ims.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.parvs.management.ims.model.User;

public interface DaoFactory<T> extends JpaRepository<T, Long>{

}
