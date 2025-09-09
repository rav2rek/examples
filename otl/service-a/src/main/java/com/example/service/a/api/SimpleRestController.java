package com.example.service.a.api;

import com.example.service.a.api.dto.UserDto;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;
import java.util.List;
import java.util.Objects;
import java.util.Random;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class SimpleRestController {

    private final Random random = new Random(System.currentTimeMillis());

    private final RestTemplate restTemplate;

    @SneakyThrows
    @GetMapping("/test")
    public String test() {

        Thread.sleep(Duration.ofSeconds(random.nextInt(10)));

        return "ok";
    }

    @GetMapping("all-users")
    public List<UserDto> allUsers() {
        ResponseEntity<List<UserDto>>
            resp = restTemplate.exchange( "http://localhost:8282/api/user"
                                        , HttpMethod.GET
                                        , HttpEntity.EMPTY
                                        , new ParameterizedTypeReference<List<UserDto>>() {} );
        return resp.getBody();
    }
}
