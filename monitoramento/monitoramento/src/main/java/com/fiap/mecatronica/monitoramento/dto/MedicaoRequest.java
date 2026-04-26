package com.fiap.mecatronica.monitoramento.dto;

public class MedicaoRequest {
    private Long sensorId;
    private Double valor;

    public MedicaoRequest() {
    }

    public Long getSensorId() {
        return sensorId;
    }

    public void setSensorId(Long sensorId) {
        this.sensorId = sensorId;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
