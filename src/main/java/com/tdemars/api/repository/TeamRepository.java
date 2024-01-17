package com.tdemars.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tdemars.api.model.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

}
