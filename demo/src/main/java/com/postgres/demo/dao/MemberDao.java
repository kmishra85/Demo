package com.postgres.demo.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.postgres.demo.model.Member;

@Repository
public interface MemberDao extends CrudRepository<Member, Long>{

}
