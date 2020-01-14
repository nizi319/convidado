package br.edu.ifal.listadeconvidados.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Convidados extends JpaRepository <Convidado, Long> {
   

}

