package com.tdemars.api.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tdemars.api.model.Player;
import com.tdemars.api.model.Team;
import com.tdemars.api.repository.PlayerRepository;
import com.tdemars.api.repository.TeamRepository;

@Configuration
public class LoadDatabase {

	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
	
	@Bean
	CommandLineRunner initDatabaseTeam(PlayerRepository repository) {
		 return args -> {
			 log.info("Preloading " + repository.save(new Player("Lebron", "James", "Small Forward", 39)));
			 log.info("Preloading " + repository.save(new Player("Stephen", "Curry", "Point Guard", 35)));
		 };
	}
	
	@Bean
	CommandLineRunner initDatabaseTeam(TeamRepository repository) {
		 return args -> {
			 log.info("Preloading " + repository.save(new Team("Knicks", "New-York")));
			 log.info("Preloading " + repository.save(new Team("Celtics", "Boston")));
		 };
	}
	
}
