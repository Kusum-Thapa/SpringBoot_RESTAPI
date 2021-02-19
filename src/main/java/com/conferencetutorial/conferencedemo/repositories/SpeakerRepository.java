package com.conferencetutorial.conferencedemo.repositories;

import com.conferencetutorial.conferencedemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
