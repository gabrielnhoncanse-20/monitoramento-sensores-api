package com.fiap.mecatronica.monitoramento.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "medicoes")
public class Medicao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "area_id", nullable = false)
    private AreaMonitoramento area;

    @Column(name = "altura_vegetacao")
    private Double alturaVegetacao;

    private Double densidade;

    private Double temperatura;

    private Double umidade;

    @Column(name = "tipo_vegetacao")
    private String tipoVegetacao;

    @Column(name = "inclinacao_terreno")
    private Double inclinacaoTerreno;

    @Column(name = "data_coleta", nullable = false)
    private LocalDateTime dataColeta;

    @Column(name = "sensor_id")
    private String sensorId;

    private String observacoes;

    public Medicao() {
    }

    public Long getId() {
        return id;
    }

    public AreaMonitoramento getArea() {
        return area;
    }

    public void setArea(AreaMonitoramento area) {
        this.area = area;
    }

    public Double getAlturaVegetacao() {
        return alturaVegetacao;
    }

    public void setAlturaVegetacao(Double alturaVegetacao) {
        this.alturaVegetacao = alturaVegetacao;
    }

    public Double getDensidade() {
        return densidade;
    }

    public void setDensidade(Double densidade) {
        this.densidade = densidade;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public Double getUmidade() {
        return umidade;
    }

    public void setUmidade(Double umidade) {
        this.umidade = umidade;
    }

    public String getTipoVegetacao() {
        return tipoVegetacao;
    }

    public void setTipoVegetacao(String tipoVegetacao) {
        this.tipoVegetacao = tipoVegetacao;
    }

    public Double getInclinacaoTerreno() {
        return inclinacaoTerreno;
    }

    public void setInclinacaoTerreno(Double inclinacaoTerreno) {
        this.inclinacaoTerreno = inclinacaoTerreno;
    }

    public LocalDateTime getDataColeta() {
        return dataColeta;
    }

    public void setDataColeta(LocalDateTime dataColeta) {
        this.dataColeta = dataColeta;
    }

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}
