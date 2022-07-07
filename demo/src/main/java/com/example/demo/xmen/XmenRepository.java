package com.example.demo.xmen;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface XmenRepository extends JpaRepository<Xmen, Long> {

    @Query("SELECT s FROM Xmen s WHERE s.alias = ?1")
    Optional<Xmen> findXmenByAlias(String alias);
}
