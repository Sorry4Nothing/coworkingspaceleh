package com.lehmann.coworkingspaceleh.service;

import com.lehmann.coworkingspaceleh.exception.BookingNotFoundException;
import com.lehmann.coworkingspaceleh.repository.BookingRepository;
import com.lehmann.coworkingspaceleh.model.BookingEntity;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Slf4j
public class BookingService {

    private final BookingRepository bookingRepository;

    BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public List<BookingEntity> loadAll() {
        log.info("Executing find all games ...");
        return bookingRepository.findAll();
    }

    public List<BookingEntity> loadAllByName(String gameName) {
        log.info("Executing find games by name '" + gameName + "' ...");
        return bookingRepository.findAllByName(gameName);
    }

    public BookingEntity loadOne(UUID gameId) {
        log.info("Executing find game with id " + gameId + " ...");
        return bookingRepository.findById(gameId).orElseThrow(() -> new BookingNotFoundException("Game not found with id " + gameId));
    }

    public BookingEntity create(BookingEntity game) {
        log.info("Executing create game with id " + game.getId() + " ...");
        return bookingRepository.save(game);
    }

    public BookingEntity update(BookingEntity updatedGame) {
        log.info("Executing update game with id " + updatedGame.getId() + " ...");
        val gameId = updatedGame.getId();
        bookingRepository.findById(gameId).orElseThrow(() -> new BookingNotFoundException("Game not found with id " + gameId));
        return bookingRepository.save(updatedGame);
    }

    public void delete(UUID gameId) {
        log.info("Executing delete game with id " + gameId + " ...");
        bookingRepository.findById(gameId).orElseThrow(() -> new BookingNotFoundException("Game not found with id " + gameId));
        bookingRepository.deleteById(gameId);
    }

}
