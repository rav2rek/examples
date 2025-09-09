package com.example.service.b.api.dto;

import com.example.service.b.mongodb.model.User;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class UserDto {
    private String id;
    private String firstName;
    private String lastName;
}
