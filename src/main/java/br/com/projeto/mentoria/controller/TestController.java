package br.com.projeto.mentoria.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping(value = "testes")
@RestController
public class TestController {
    @GetMapping(path = "/")
    public String get() {
        return "Robinho";
    }
}
