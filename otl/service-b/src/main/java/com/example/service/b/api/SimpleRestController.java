package com.example.service.b.api;

import com.example.service.b.api.dto.AddUserDto;
import com.example.service.b.api.dto.UserDto;
import com.example.service.b.api.dto.mapper.DtoToModelMapper;
import com.example.service.b.mongodb.model.User;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.*;

import java.time.Duration;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class SimpleRestController {

    private final Random random = new Random(System.currentTimeMillis());

    private final MongoTemplate mongoTemplate;
    private final DtoToModelMapper dtoToModelMapper;

    @SneakyThrows
    @PostMapping("/user")
    public String user(@RequestBody AddUserDto addUserDto) {

        mongoTemplate.save( dtoToModelMapper.toModel(addUserDto) );

        return "ok";
    }

    @GetMapping("user")
    public List<UserDto> findAll() {
        return mongoTemplate.findAll(User.class).stream()
                            .map(dtoToModelMapper::toDto)
                            .toList();
    }
}
