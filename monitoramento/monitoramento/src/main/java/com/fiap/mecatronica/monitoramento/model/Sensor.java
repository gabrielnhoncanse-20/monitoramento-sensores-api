package com.fiap.mecatronica.monitoramento.model;
import jakarta.persistence.*;
@Entity
@Table(name = "sensores")
public class Sensor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String tipo;
    private Double limiteMinimo;
    private Double limiteMaximo;
    private Boolean ativo;
    public Sensor() {
    }
    public Sensor(String nome, String tipo, Double limiteMinimo, Double limiteMaximo, Boolean ativo) {
        this.nome = nome;
        this.tipo = tipo;
        this.limiteMinimo = limiteMinimo;
        this.limiteMaximo = limiteMaximo;
        this.ativo = ativo;
    }
    public Long getId() { return id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public Double getLimiteMinimo() { return limiteMinimo; }
    public void setLimiteMinimo(Double limiteMinimo) { this.limiteMinimo = limiteMinimo; }
    public Double getLimiteMaximo() { return limiteMaximo; }
    public void setLimiteMaximo(Double limiteMaximo) { this.limiteMaximo = limiteMaximo; }
    public Boolean getAtivo() { return ativo; }
    public void setAtivo(Boolean ativo) { this.ativo = ativo; }
}