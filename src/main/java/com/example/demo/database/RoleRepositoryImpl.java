package com.example.demo.database;


import org.springframework.stereotype.Repository;

import com.example.demo.entities.Role;

@Repository
public class RoleRepositoryImpl extends JpaRepositoryImpl<Role> implements RoleRepository {

}
