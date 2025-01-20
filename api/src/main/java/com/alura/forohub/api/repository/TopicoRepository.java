package com.alura.forohub.api.repository;

import com.alura.forohub.api.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
}
