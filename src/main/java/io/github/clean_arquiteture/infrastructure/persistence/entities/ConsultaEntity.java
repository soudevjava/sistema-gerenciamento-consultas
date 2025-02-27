package io.github.clean_arquiteture.infrastructure.persistence.entities;

import java.time.OffsetDateTime;

import io.github.clean_arquiteture.infrastructure.enumerate.StatusConsultaEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table( name = "consulta")
public class ConsultaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_consulta")
    private Long id;

    @Column(nullable = false, name = "data_consulta")
    private OffsetDateTime dataConsulta;

    @Column(nullable = false, length = 45, name = "status_consulta")
    private StatusConsultaEnum statusConsulta;

    @ManyToOne
    @JoinColumn(name = "id_paciente", nullable = false)
    private PacienteEntity paciente;

    @ManyToOne
    @JoinColumn(name = "id_medico", nullable = false)
    private MedicoEntity medico;

    public ConsultaEntity() {}

    public ConsultaEntity(Long id, OffsetDateTime dataConsulta, StatusConsultaEnum statusConsulta, PacienteEntity paciente, MedicoEntity medico) {
        this.id = id;
        this.dataConsulta = dataConsulta;
        this.statusConsulta = statusConsulta;
        this.paciente = paciente;
        this.medico = medico;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OffsetDateTime getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(OffsetDateTime dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public StatusConsultaEnum getStatusConsulta() {
        return statusConsulta;
    }

    public void setStatusConsulta(StatusConsultaEnum statusConsulta) {
        this.statusConsulta = statusConsulta;
    }

    public PacienteEntity getPaciente() {
        return paciente;
    }

    public void setPaciente(PacienteEntity paciente) {
        this.paciente = paciente;
    }

    public MedicoEntity getMedico() {
        return medico;
    }

    public void setMedico(MedicoEntity medico) {
        this.medico = medico;
    }
}
