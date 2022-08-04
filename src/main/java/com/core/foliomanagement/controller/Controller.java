package com.core.foliomanagement.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Produces;

@Produces("Application/Json")
@RequiredArgsConstructor
@RestController
public class Controller {

    @GetMapping(path="/iniciar")
    public String iniciarApp() {
        return "inicio app";
    }

    @PostMapping(path="/iniciar2/{parametro}")
    public String iniciarApp2(@PathVariable("parametro") String parametro) {
        return "inicio app " + parametro;
    }
}
