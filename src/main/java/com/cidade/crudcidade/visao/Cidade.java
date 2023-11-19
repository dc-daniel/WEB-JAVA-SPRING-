package com.cidade.crudcidade.visao;

import lombok.Data;

@Data
public final class Cidade {

    private String nome;
    private String estado;

    public Cidade(String nome, String estado) {
        this.nome = nome;
        this.estado = estado;
    }



}
