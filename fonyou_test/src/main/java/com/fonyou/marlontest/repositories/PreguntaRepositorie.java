package com.fonyou.marlontest.repositories;

import com.fonyou.marlontest.domains.maestros.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreguntaRepositorie extends JpaRepository<Pregunta,Long> {
}
