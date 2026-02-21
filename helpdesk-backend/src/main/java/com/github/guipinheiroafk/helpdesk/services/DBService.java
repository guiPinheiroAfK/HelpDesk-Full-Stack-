package com.github.guipinheiroafk.helpdesk.services;


import com.github.guipinheiroafk.helpdesk.domain.Chamado;
import com.github.guipinheiroafk.helpdesk.domain.Usuario;
import com.github.guipinheiroafk.helpdesk.domain.enums.Perfil;
import com.github.guipinheiroafk.helpdesk.domain.enums.Prioridade;
import com.github.guipinheiroafk.helpdesk.domain.enums.Status;
import com.github.guipinheiroafk.helpdesk.repositories.ChamadoRepository;
import com.github.guipinheiroafk.helpdesk.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private ChamadoRepository chamadoRepository;

    public void instanciaBaseDeDados() {
        // Criando o Técnico
        Usuario tec1 = new Usuario();
        tec1.setNome("Gulherme Pinheiro");
        tec1.setEmail("admin@mail.com");
        tec1.setSenha("123");
        tec1.addPerfil(Perfil.ADMIN);

        // Criando o Cliente
        Usuario cli1 = new Usuario();
        cli1.setNome("Linus Torvalds");
        cli1.setEmail("linux@mail.com");
        cli1.setSenha("123");
        cli1.addPerfil(Perfil.CLIENTE);

        // Salvando no Banco
        usuarioRepository.saveAll(Arrays.asList(tec1, cli1));
    }
}