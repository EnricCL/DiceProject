package com.ecomesbe.dice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecomesbe.dice.dto.Game;

public interface IGameDAO extends JpaRepository<Game, Long>{
	
	List<Game> findGamesByPlayerId (Long playerId);

}
