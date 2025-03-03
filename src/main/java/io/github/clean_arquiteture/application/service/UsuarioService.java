package io.github.clean_arquiteture.application.service;

import io.github.clean_arquiteture.application.DTO.request.UsuarioRequestDTO;
import io.github.clean_arquiteture.application.DTO.response.UsuarioResponseDTO;
import io.github.clean_arquiteture.application.mapper.UsuarioMapper;
import io.github.clean_arquiteture.domain.exceptions.DatabaseException;
import io.github.clean_arquiteture.domain.exceptions.ResourceNotFoundException;
import io.github.clean_arquiteture.infrastructure.persistence.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService {

     private final UsuarioRepository usuarioRepository;
     private final UsuarioMapper usuarioMapper;

     @Transactional
     public UsuarioResponseDTO insert(UsuarioRequestDTO requestDTO) {
          var usuario = usuarioMapper.toEntity(requestDTO);
          return usuarioMapper.toDTO(usuarioRepository.save(usuario));
     }

     @Transactional(readOnly = true)
     public UsuarioResponseDTO findById(Long id) {
          return  usuarioMapper.toDTO(usuarioRepository.findById(id)
                  .orElseThrow(() -> new ResourceNotFoundException("Usuario não encontrado! id: " + id))
          );
     }

     @Transactional(readOnly = true)
     public List<UsuarioResponseDTO> findAll() {
          return usuarioMapper.toListDTO(usuarioRepository.findAll());
     }

     @Transactional
     public  UsuarioResponseDTO update(Long id, UsuarioRequestDTO requestDTO) {
          var usuario = usuarioRepository.findById(id)
                  .orElseThrow(() -> new ResourceNotFoundException("Usuario não encontrado! id: " + id));
          usuarioMapper.updateEntity(requestDTO, usuario);
          return usuarioMapper.toDTO(usuarioRepository.save(usuario));
     }

     @Transactional
     public  UsuarioResponseDTO updatePartial(Long id, UsuarioRequestDTO requestDTO) {
          var usuario = usuarioRepository.findById(id)
                  .orElseThrow(() -> new ResourceNotFoundException("Usuario não encontrado! id: " + id));
          if (requestDTO != null) usuario.setNome(requestDTO.getNome());
          if (requestDTO != null) usuario.setEmail(requestDTO.getEmail());
          if (requestDTO != null) usuario.setSenha(requestDTO.getSenha());
          if (requestDTO != null) usuario.setPerfil(requestDTO.getPerfil());
          return usuarioMapper.toDTO(usuarioRepository.save(usuario));
     }

     @Transactional
     public void delete(Long id) {
          if (!usuarioRepository.existsById(id)) {
               throw new ResourceNotFoundException("Usuario não encontrado! id: " + id);
          }
          try {
               usuarioRepository.deleteById(id);
          } catch (DataIntegrityViolationException exception) {
               throw new DatabaseException("Não é possível excluir um usuário que possui registros associados!");
          } catch (Exception exception) {
               throw new RuntimeException("Erro inesperado ao excluir usuário: " + exception.getMessage());
          }
     }
}
