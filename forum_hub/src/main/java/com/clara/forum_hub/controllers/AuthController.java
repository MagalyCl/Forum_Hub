package com.clara.forum_hub.controllers;

import com.clara.forum_hub.dto.security.AuthDto;
import com.clara.forum_hub.dto.security.TokenJWTDto;
import com.clara.forum_hub.models.entities.Usuario;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import com.clara.forum_hub.services.TokenService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AuthController {

    @Autowired
    private AuthenticationManager manager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity efetuarLogin(@RequestBody @Valid AuthDto dados) {
        var authToken = new UsernamePasswordAuthenticationToken(dados.email(), dados.senha());
        var auth = manager.authenticate(authToken);

        var tokenJWT = tokenService.gerarToken((Usuario) auth.getPrincipal());
        return ResponseEntity.ok(new TokenJWTDto(tokenJWT));
    }
}
