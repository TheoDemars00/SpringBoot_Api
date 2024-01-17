package com.tdemars.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tdemars.api.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

}
