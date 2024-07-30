package com.project.ProjectUser.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.ProjectUser.Entity.User;

@Repository
public interface UserRepository extends CrudRepository <User,Long> {

}
