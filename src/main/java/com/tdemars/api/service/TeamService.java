package com.tdemars.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tdemars.api.model.Team;
import com.tdemars.api.repository.TeamRepository;
import lombok.Data;

@Data
@Service
public class TeamService {

	@Autowired
	private TeamRepository teamRepository;
	
	
	public List<Team> findAllTeams(){
		return this.teamRepository.findAll();
	}
	
	
	public Team findTeam(Long id) {
        return this.teamRepository.findById(id).orElse(null);
    }
	
	
	public Team saveTeam(Team foundTeam) {
        return this.teamRepository.save(foundTeam);
    }
	
	
    public Team createTeam(Team team) {
        return this.teamRepository.save(team);
    }
    
	
    public void deleteTeam(Long id) {
        this.teamRepository.deleteById(id);
        
    }
}
