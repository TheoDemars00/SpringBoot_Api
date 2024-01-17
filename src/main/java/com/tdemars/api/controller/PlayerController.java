package com.tdemars.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tdemars.api.model.Player;
import com.tdemars.api.service.PlayerService;

@RestController
public class PlayerController {

	@Autowired
	private PlayerService playerService;
	
	 @GetMapping("/players")
	 public List<Player> allPlayers(){
		 return this.playerService.findAllPlayers();
	 }
	 
	 @GetMapping("/players/{id}")
	 public Player onePlayer(@PathVariable Long id){
		 return this.playerService.findPlayer(id);
	 }
	 
	 @PostMapping("/players")
	 public Player createPlayer(@RequestBody Player player) {
		 return this.playerService.createPlayer(player);
	 }

	 @DeleteMapping("/players/{id}")
	 public void deletePlayer(@PathVariable Long id){
		 this.playerService.deletePlayer(id);
	 }

	 @PutMapping("/players/{id}")
	 Player replacPlayer(@RequestBody Player player, @PathVariable Long id){
		 Player foundPlayer = this.playerService.findPlayer(id);

	     if (player!=null){
	    	 foundPlayer.setFirstName(player.getFirstName());
	         foundPlayer.setLastName(player.getLastName());
	         foundPlayer.setPosition(player.getPosition());
	         foundPlayer.setAge(player.getAge());

	         foundPlayer = this.playerService.savePlayer(foundPlayer);
	    }
	    return foundPlayer;
	 }
}
