package com.lehmann.coworkingspaceleh.repository;

import com.lehmann.coworkingspaceleh.model.MemberEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.UUID;

public interface MemberRepository extends CrudRepository<MemberEntity, UUID> {

    Optional<MemberEntity> findByUsername(String username);

}
