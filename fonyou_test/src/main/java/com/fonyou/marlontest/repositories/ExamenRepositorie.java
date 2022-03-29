package com.fonyou.marlontest.repositories;

import com.fonyou.marlontest.domains.maestros.Examen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamenRepositorie extends JpaRepository<Examen, Long> {
}
