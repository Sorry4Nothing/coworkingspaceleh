package com.lehmann.coworkingspaceleh.repository;

import com.lehmann.coworkingspaceleh.model.GameEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface GameRepository extends CrudRepository<GameEntity, UUID> {
    List<GameEntity> findAll();
    List<GameEntity> findAllByName(String name);
}
