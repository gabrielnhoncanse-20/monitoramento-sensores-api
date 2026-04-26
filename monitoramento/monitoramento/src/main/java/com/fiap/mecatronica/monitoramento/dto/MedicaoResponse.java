package com.fiap.mecatronica.monitoramento.dto;

import com.fiap.mecatronica.monitoramento.model.StatusMedicao;

import java.time.LocalDateTime;

public class MedicaoResponse {
    private Long id;
    private Long sensorId;
    private String sensorNome;
    private Double valor;
    private LocalDateTime data;
    private StatusMedicao status;

    public MedicaoResponse() {
    }

    public MedicaoResponse(Long id, Long sensorId, String sensorNome, Double valor, LocalDateTime data,
            StatusMedicao status) {
        this.id = id;
        this.sensorId = sensorId;
        this.sensorNome = sensorNome;
        this.valor = valor;
        this.data = data;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSensorId() {
        return sensorId;
    }

    public void setSensorId(Long sensorId) {
        this.sensorId = sensorId;
    }

    public String getSensorNome() {
        return sensorNome;
    }

    public void setSensorNome(String sensorNome) {
        this.sensorNome = sensorNome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public StatusMedicao getStatus() {
        return status;
    }

    public void setStatus(StatusMedicao status) {
        this.status = status;
    }
}
