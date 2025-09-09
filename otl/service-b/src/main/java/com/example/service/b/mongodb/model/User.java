package com.example.service.b.mongodb.model;

import lombok.Builder;
import lombok.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Value
@Builder
@Document
@TypeAlias("User")
public class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
}
