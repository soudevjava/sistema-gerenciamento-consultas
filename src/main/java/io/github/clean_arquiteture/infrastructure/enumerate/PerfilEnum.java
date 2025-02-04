package io.github.clean_arquiteture.infrastructure.enumerate;

public enum PerfilEnum {
    ATENDENTE("Atenmdente"),
    MEDICO("Medico"),
    PACIENTE("Paciente");

    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    PerfilEnum(String descricao) {
        this.descricao = descricao;
    }
}
