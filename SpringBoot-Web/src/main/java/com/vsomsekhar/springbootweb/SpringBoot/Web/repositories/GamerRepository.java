package com.vsomsekhar.springbootweb.SpringBoot.Web.repositories;

import com.vsomsekhar.springbootweb.SpringBoot.Web.entities.GamerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GamerRepository extends JpaRepository<GamerEntity, Long> {



}
