package com.bilaldemir.repository;

import java.util.List;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bilaldemir.Utils.Constans;
import com.bilaldemir.model.User;

public interface UserRepository extends CrudRepository<User, String> {

    @Query("SELECT * FROM " + Constans.USER_TABLE + " where " + Constans.USER_TABLE_NAME + "=?0" + " ALLOW FILTERING")
    List<User> findByName(String name);

}
