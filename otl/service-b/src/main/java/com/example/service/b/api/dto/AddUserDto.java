package com.example.service.b.api.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class AddUserDto {
    private String firstName;
    private String lastName;
}
