package com.example.service.b.api.dto.mapper;

import com.example.service.b.api.dto.AddUserDto;
import com.example.service.b.api.dto.UserDto;
import com.example.service.b.mongodb.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(
    componentModel = "spring",
    nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface DtoToModelMapper {

    User toModel(AddUserDto dto);
    UserDto toDto(User model);
}
