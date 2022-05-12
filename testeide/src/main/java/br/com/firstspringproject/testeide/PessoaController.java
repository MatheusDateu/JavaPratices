package br.com.firstspringproject.testeide;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.parser.Entity;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    public ResponseEntity<Pessoa> getPessoa(){

        final Pessoa pessoa = new Pessoa("Matheus", 21);

        return ResponseEntity.ok(pessoa);
    }
}
