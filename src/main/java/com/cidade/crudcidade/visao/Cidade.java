package com.cidade.crudcidade.visao;

public final class Cidade {

    private String nome;
    private String estado;

    public Cidade(String nome, String estado) {
        this.nome = nome;
        this.estado = estado;
    }

    public Cidade() {
    }

    public String getNome() {
        return nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
