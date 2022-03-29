package com.fonyou.marlontest.repositories;

import com.fonyou.marlontest.domains.maestros.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepositorie  extends JpaRepository<Estudiante, Long> {
}
