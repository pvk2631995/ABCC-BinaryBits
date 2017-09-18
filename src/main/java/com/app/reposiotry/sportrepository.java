package com.app.reposiotry;

import com.app.domain.Player;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface sportrepository extends MongoRepository<Player, String>{

		//@Query(value = "{PlayeremailId: ?0}")
	    //public Player findByPlayeremailId(String PlayeremailId);
}
