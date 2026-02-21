package com.github.guipinheiroafk.helpdesk.repositories;

import com.github.guipinheiroafk.helpdesk.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    // adicionar buscas personalizadas no futuro, ex: buscar por email, nome, celular, etc
}