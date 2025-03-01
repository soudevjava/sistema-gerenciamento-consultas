package io.github.clean_arquiteture.infrastructure.persistence.entity;

import java.time.OffsetDateTime;
import java.util.List;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name= "paciente")
public class PacienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_paciente")
    private Long id;

    @Column(nullable = false, length = 50)
    private String nome;

    @CPF
    @Column(nullable = false, length = 14, unique = true)
    private String cpf;

    @Column(nullable = false, length = 100)
    private String endereco;

    @Column(nullable = false, length = 15)
    private String telefone;

    @Column(name = "data_nascimento")
    private OffsetDateTime dataNascimento;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ConsultaEntity> consultas;

    public PacienteEntity() {}

    public PacienteEntity(Long id, String nome, String cpf, String endereco, String telefone, OffsetDateTime dataNascimento, List<ConsultaEntity> consultas) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.consultas = consultas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public OffsetDateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(OffsetDateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<ConsultaEntity> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<ConsultaEntity> consultas) {
        this.consultas = consultas;
    }
}
