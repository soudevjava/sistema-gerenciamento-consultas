package io.github.clean_arquiteture.infrastructure.enumerate;

public enum EspecialidadeEnum {
    CARDIOLOGISTA("Cardiologista"),
    ORTOPEDISTA("Ortopedista"),
    PEDIATRIA("Pediatria"),
    OFTAMOLOGISTA("Oftamologista"),
    NEUROLOGISTA("Meurologista");

    public String descricao;

    public String getDescricao() {
        return descricao;
    }

    EspecialidadeEnum(String descricao) {
        this.descricao = descricao;
    }
}
