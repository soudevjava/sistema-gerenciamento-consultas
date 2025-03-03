package io.github.clean_arquiteture.application.mapper;

import io.github.clean_arquiteture.application.DTO.request.UsuarioRequestDTO;
import io.github.clean_arquiteture.application.DTO.response.UsuarioResponseDTO;
import io.github.clean_arquiteture.infrastructure.persistence.entity.UsuarioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

     UsuarioResponseDTO toDTO(UsuarioEntity entity);
     UsuarioEntity toEntity(UsuarioRequestDTO requestDTO);
     List<UsuarioResponseDTO> toListDTO(List<UsuarioEntity> entity);

     @Mapping(target = "id", ignore = true)
     void updateEntity(UsuarioRequestDTO requestDTO, UsuarioEntity entity);
}
