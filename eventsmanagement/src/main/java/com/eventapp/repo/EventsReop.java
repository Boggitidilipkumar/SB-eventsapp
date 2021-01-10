package com.eventapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.eventapp.entities.Events;

@Repository
public interface EventsReop extends JpaRepository<Events, Integer> {

}
