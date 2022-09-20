package com.lehmann.coworkingspaceleh.repository;

import com.lehmann.coworkingspaceleh.model.BookingEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface BookingRepository extends CrudRepository<BookingEntity, UUID> {
    List<BookingEntity> findAll();
    List<BookingEntity> findAllByName(String name);
}
