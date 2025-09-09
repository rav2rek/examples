package com.example.service.a.api.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class UserDto {
    private String id;
    private String firstName;
    private String lastName;
}
