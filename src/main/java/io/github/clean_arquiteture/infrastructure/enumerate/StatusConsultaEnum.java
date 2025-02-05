package io.github.clean_arquiteture.infrastructure.enumerate;

public enum StatusConsultaEnum {
    CONFIRMADA("Confirmada"),
    NAO_CONFIRMADA("Não Confirmada"),
    CANCELADA("Cancelada"),
    REAGENDADA("Reagendada"),
    EM_ATENDIMENTO("Em Atendimento");

    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    StatusConsultaEnum(String descricao) {
        this.descricao = descricao;
    }
}
