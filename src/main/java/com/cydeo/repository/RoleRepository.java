package com.cydeo.repository;

import com.cydeo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    //build all queries that bring data from db
    // repository
    //derive, @Query(JPA-Native)

    // there 20 methods here (save, findAll)
}
