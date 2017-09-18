package com.app.reposiotry;
import com.app.domain.cricPlayer;

import org.springframework.data.mongodb.repository.MongoRepository;
public interface cricksportrepository extends MongoRepository<cricPlayer, String>{

}
