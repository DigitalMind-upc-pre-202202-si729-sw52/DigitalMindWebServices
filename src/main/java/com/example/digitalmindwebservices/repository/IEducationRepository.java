package com.example.digitalmindwebservices.repository;

import com.example.digitalmindwebservices.entities.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IEducationRepository extends JpaRepository<Education, Long> {
    Optional<Education> findByDigitalProfileId(Long id);
}
