package com.fiap.mecatronica.monitoramento.model;

public enum StatusVegetacao {
    NORMAL("Normal - Vegetacao controlada"),
    ATENCAO("Atencao - Monitoramento recomendado"),
    URGENTE("Urgente - Intervencao necessaria");

    private final String descricao;

    StatusVegetacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
