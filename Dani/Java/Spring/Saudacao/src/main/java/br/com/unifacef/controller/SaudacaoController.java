package br.com.unifacef.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaudacaoController {

    @GetMapping("/mensagem")
    public String retornaBomDia () {
        return "Bom Dia";
    }

    @GetMapping("/mensagem2")
    public String retornaBoaTarde () {
        return "Boa Tarde";
    }

    @GetMapping("/mensagem3/{nome}")
    public String retornaBooNoite (@PathVariable("nome") String nome) {
        return "Boa Noite " + nome;
    }
}
