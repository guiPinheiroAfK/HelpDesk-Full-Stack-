package com.github.guipinheiroafk.helpdesk.repositories;

import com.github.guipinheiroafk.helpdesk.domain.Chamado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {
}