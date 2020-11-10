package com.ecomesbe.dice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecomesbe.dice.dto.Player;

public interface IPlayerDAO extends JpaRepository<Player, Long>{

	Player findPlayerByName(String name);
}
