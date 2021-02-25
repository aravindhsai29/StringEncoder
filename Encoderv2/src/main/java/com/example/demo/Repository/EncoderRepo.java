package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.CharacterEncoder;

@Repository
public interface EncoderRepo extends JpaRepository<CharacterEncoder,Long> {
//	@Query("SELECT input FROM Encoder t WHERE t.input = ?1")
//	CharacterEncoder findByInput(String input);
}
