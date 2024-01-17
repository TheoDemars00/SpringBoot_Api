package com.tdemars.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tdemars.api.model.Player;
import com.tdemars.api.repository.PlayerRepository;

import lombok.Data;

@Data
@Service
public class PlayerService {
	
	@Autowired
	private PlayerRepository playerRepository;
	
	
	public List<Player> findAllPlayers(){
		return this.playerRepository.findAll();
	}
	
	
	public Player findPlayer(Long id) {
        return this.playerRepository.findById(id).orElse(null);
    }
	
	
	public Player savePlayer(Player foundPlayer) {
        return this.playerRepository.save(foundPlayer);
    }
	
	
    public Player createPlayer(Player player) {
        return this.playerRepository.save(player);
    }
    
	
    public void deletePlayer(Long id) {
        this.playerRepository.deleteById(id);
        
    }
}
