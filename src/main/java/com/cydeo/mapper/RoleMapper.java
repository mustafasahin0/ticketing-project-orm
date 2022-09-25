package com.cydeo.mapper;

import com.cydeo.dto.RoleDTO;
import com.cydeo.entity.Role;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class RoleMapper {

    private final ModelMapper modalMapper;

    public RoleMapper(ModelMapper modalMapper) {
        this.modalMapper = modalMapper;
    }

    // ConvertToEntity
    public Role convertToEntity(RoleDTO dto) {

        return modalMapper.map(dto, Role.class);
    }

    // Convert To DTO
    public RoleDTO convertToDto(Role entity) {
        return modalMapper.map(entity, RoleDTO.class);
    }
}
