package br.edu.ifal.listadeconvidados.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Convidado implements Serializable{

    private static final long  serialVersionUID = 1L;
   
    @Id
    @GeneratedValue
    private Long id;
    private Integer quantidadeAcompanhante;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantidadeAcompanhante() {
        return quantidadeAcompanhante;
    }

    public void setQuantidadeAcompanhante(Integer quantidadeAcompanhante) {
        this.quantidadeAcompanhante = quantidadeAcompanhante;
    }

 


}